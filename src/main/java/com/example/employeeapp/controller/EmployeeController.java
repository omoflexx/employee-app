package com.example.employeeapp.controller;

import com.example.employeeapp.model.Employee;
import com.example.employeeapp.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles all web requests for viewing, adding, editing, and deleting employees.
 */
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    /**
     * Constructor injection, as required by the project's coding standards.
     */
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Displays the list of all employees.
     */
    @GetMapping
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees/list";
    }

    /**
     * Displays the form for adding a new employee.
     */
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/add";
    }

    /**
     * Saves a new employee after validating the submitted name.
     */
    @PostMapping
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employees/add";
        }
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

    /**
     * Displays the form for editing an existing employee.
     */
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));
        model.addAttribute("employee", employee);
        return "employees/edit";
    }

    /**
     * Updates an existing employee after validating the submitted name.
     */
    @PostMapping("/{id}/edit")
    public String updateEmployee(@PathVariable Long id, @Valid @ModelAttribute("employee") Employee employee,
                                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            employee.setId(id);
            return "employees/edit";
        }
        employee.setId(id);
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

    /**
     * Deletes an employee. Uses POST, never GET, to avoid destructive actions
     * being triggered by simple link visits or crawlers.
     */
    @PostMapping("/{id}/delete")
    public String deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        return "redirect:/employees";
    }
}

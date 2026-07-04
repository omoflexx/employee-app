# Employee Management Application (Python / Django)

## Objective

Build a simple Django web application for learning purposes — a Python
equivalent of the existing Java Spring Boot employee app described in
CLAUDE.md.

The application should allow a user to:

- Add an employee
- View all employees
- Edit an employee
- Delete an employee

Only the employee name should be stored.

---

# Technology Stack

Use the following technologies:

- Python 3.11+
- Django
- Django Templates (server-rendered HTML, equivalent to Thymeleaf)
- Django ORM
- SQLite

---

# Database

Use SQLite.

Database file location:

data/employees.db

Create the database automatically via Django migrations if it does not
exist.

The Employee table should contain:

- Id
- Name

---

# User Interface

Create three pages.

## Employee List

Display:

ID

Employee Name

Actions

Each employee should have:

- Edit button
- Delete button

There should also be an "Add Employee" button.

---

## Add Employee

Display a form with:

Employee Name

Buttons:

Save

Cancel

---

## Edit Employee

Display the current employee name.

Allow updating it.

Buttons:

Update

Cancel

---

# Validation

Employee name:

- Required
- Cannot be blank
- Maximum 100 characters

Display friendly validation messages using Django forms.

---

# Coding Standards

Use:

- Django forms for input handling and validation
- Class-based or function-based views (pick one style and stay
  consistent)
- Package structure (separate app for employees)
- Meaningful variable names
- Comments where useful

Do NOT use:

- Raw SQL
- Hardcoded secrets in settings.py

---

# Security Requirements

Do not hard-code secrets. Load SECRET_KEY and other config from
environment variables (e.g. via a .env file, not committed to Git).

Use the Django ORM. Do not use raw SQL.

Delete operations must use POST.

Never use GET for deleting records.

Django's CSRF protection must remain enabled on all forms.

Do not commit the SQLite database file to Git.

Create a .gitignore file.

---

# Project Structure

Create a clean project structure similar to:

employee-app-python/

manage.py

employee_project/

settings.py

urls.py

wsgi.py

employees/

models.py

views.py

urls.py

forms.py

templates/

employees/

employee_list.html

employee_form.html

data/

employees.db

requirements.txt

.gitignore

claude_python.md

---

# Claude Behaviour

Before creating any files:

1. Explain your implementation plan.

2. Show the project structure.

3. Wait for my approval.

After approval:

Create one file at a time.

After each file:

- Explain why it exists.
- Explain what it does.
- Wait for my confirmation before continuing.

After the application is complete:

- Review the project.
- Suggest improvements.
- Suggest security improvements.
- Suggest better coding practices.

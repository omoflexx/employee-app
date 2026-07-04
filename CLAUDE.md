# Employee Management Application

## Objective

Build a simple Java Spring Boot web application for learning purposes.

The application should allow a user to:

- Add an employee
- View all employees
- Edit an employee
- Delete an employee

Only the employee name should be stored.

---

# Technology Stack

Use the following technologies:

- Java 17
- Spring Boot
- Maven
- Thymeleaf
- Spring Data JPA
- SQLite

---

# Database

Use SQLite.

Database file location:

data/employees.db

Create the database automatically if it does not exist.

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

Display friendly validation messages.

---

# Coding Standards

Use:

- Constructor Injection
- Package structure
- Meaningful variable names
- Comments where useful

Do NOT use:

- Lombok
- Field Injection

---

# Security Requirements

Do not hard-code secrets.

Use Spring Data JPA.

Do not use raw SQL.

Delete operations must use POST.

Never use GET for deleting records.

Do not commit SQLite database files to Git.

Create a .gitignore file.

---

# Project Structure

Create a clean project structure similar to:

employee-app/

src/

main/

java/

controller/

model/

repository/

resources/

templates/

application.properties

pom.xml

.gitignore

CLAUDE.md

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
package com.example.employeeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

/**
 * Entry point for the Employee Management application.
 */
@SpringBootApplication
public class EmployeeAppApplication {

    public static void main(String[] args) {
        // The SQLite JDBC driver creates the database file automatically,
        // but not its parent directory, so we ensure "data/" exists here
        // before the datasource bean tries to connect.
        new File("data").mkdirs();

        SpringApplication.run(EmployeeAppApplication.class, args);
    }
}

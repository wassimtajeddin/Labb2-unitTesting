package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee = new Employee(null,0.0);

    @Test
    void SetIdShouldSetEmployeeIdAsValue() {
        employee.setId("152421");
        assertEquals("152421",employee.getId());

    }

    @Test
    void setSalaryShouldSetEmployeeSalaryAsValue() {
        employee.setSalary(29900);
        assertEquals(29900,employee.getSalary());
    }

    @Test
    void setPaidShouldSetTrueWhenTheSalaryIsPaid() {
        employee.setPaid(true);
        assertTrue(employee.isPaid());
    }

    @Test
    void ToStringShouldReturnEmployeeIdAndSalary() {
        employee.setId("12345");
        employee.setSalary(37250.0);
        assertEquals("Employee [id=12345, salary=37250.0]",employee.toString());


    }
}
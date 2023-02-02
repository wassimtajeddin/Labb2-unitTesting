package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class EmployeesTest {
EmployeeRepositoryImp employeeRepositoryImp = new EmployeeRepositoryImp();
BankService bankService = mock(BankService.class);
Employees employees = new Employees(employeeRepositoryImp,bankService);
Employee employee1 = new Employee("1",27000);
Employee employee2 = new Employee("2",30000);
    @Test
    void payEmployeesShouldReternPayments() {
       employeeRepositoryImp.save(employee1);
       employeeRepositoryImp.save(employee2);
        assertEquals(2, employees.payEmployees());
    }
    }

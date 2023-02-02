package com.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

class EmployeesTest {
    EmployeeRepository employeeRepositoryImp = new EmployeeRepositoryImp();
    BankService bankService = mock(BankService.class);

    Employees employees = new Employees(employeeRepositoryImp,bankService);
    Employee employee1 = new Employee("1",27000.0);
    Employee employee2 = new Employee("2",30000.0);

    @BeforeEach
    void initTest() {
        employeeRepositoryImp.save(employee1);
        employeeRepositoryImp.save(employee2);
    }
    @Test
    void seeIfEmployeeOneGetsPaid(){
        employees.payEmployees();

        assertTrue(employeeRepositoryImp.findAll().get(0).isPaid());

    }
    @Test
    void seeIfEmployeeTwoGetsPaid() {
        employees.payEmployees();

        assertTrue(employeeRepositoryImp.findAll().get(1).isPaid());

    }
    @Test
    void seeIfTryCatchWorks() {

        doThrow(RuntimeException.class).when(bankService).pay(employee1.getId(), employee1.getSalary());
        employees.payEmployees();

        assertFalse(employee1.isPaid());
    }


    }

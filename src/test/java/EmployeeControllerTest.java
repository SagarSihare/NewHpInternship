import com.example.Hp.Internship.Controller.EmployeeController;
import com.example.Hp.Manager.EmployeeManager;
import com.example.Hp.Resource.Employee;
import com.example.Hp.Resource.Employees;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeControllerTest {

    private EmployeeManager employeeManager;
    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        
        employeeManager = new EmployeeManager();
        employeeController = new EmployeeController(employeeManager);
    }

    @Test
    void testGetAllEmployees() {
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ID001", "John", "Doe", "john.doe@email.com", "Manager"));
        employeeList.add(new Employee("ID002", "Jane", "Smith", "jane.smith@email.com", "Developer"));

       
        Employees result = employeeController.getAllEmployees();

       
        assertEquals(employeeList, result.getEmployeeList());
    }

    @Test
    void testAddEmployee() {
        
        Employee newEmployee = new Employee("ID005", "New", "Employee", "new.employee@email.com", "New Position");

        
        Employees result = employeeController.addEmployee(newEmployee);

        
        assertEquals(1, result.getEmployeeList().size());
        assertEquals(newEmployee, result.getEmployeeList().get(0));
    }
}

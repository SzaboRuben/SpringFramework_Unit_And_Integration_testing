package spring.di;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

//Unit test for EmployeeDao (no dependencies, no BL implemented ... )
public class EmployeeDaoTest {

    EmployeeDao employeeDao = new EmployeeDao();

    @Test
    public void testSaveAndListEmployee(){
        employeeDao.saveEmployee(" John ");
        assertEquals(List.of(" John "), employeeDao.getEmployeeList() );
    }

}

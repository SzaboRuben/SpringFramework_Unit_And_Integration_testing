package spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

// Unit test for EmployeeService which has dependencie(s) (= EmployeeDao)
// We MOCK this component, in order to make the test indepentend
@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    //    Mocking the dependency with annotation = utilizing  ! MockitoJUnitRunner !
    @Mock
    EmployeeDao employeeDao;

    //    Mocking the dependency without annotation ( = this is what ! MockitoJUnitRunner ! does in the background)
//    EmployeeDao employeeDao = mock(EmployeeDao.class);


    //   Declaring and instantiating an EmployeeService Object = utilizing   ! MockitoJUnitRunner !
    @InjectMocks
    EmployeeService employeeService;

    //     Declaring and instantiating an EmployeeService Object without annotation ( = this is what ! MockitoJUnitRunner ! does in the background)
//     EmployeeService employeeService = new EmployeeService(employeeDao);


    @Test
    public void testSaveEmployee() {
        employeeService.saveEmployee(" John ");
//        employeeDao Object's saveEmployee method should be called having the Business Logic already implemented (Trimmed name)
        verify(employeeDao).saveEmployee("John");
    }


}

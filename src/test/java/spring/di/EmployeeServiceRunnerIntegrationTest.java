package spring.di;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

// Integration testing = testing multiple components at the same time utilizing Annotations from Spring frameworks

//Using @RunWith(SpringJUnit4ClassRunner.class) Spring starts.
@RunWith(SpringJUnit4ClassRunner.class)
//Using @ContextConfiguration(classes = AppConfig.class) our Spring bean classes will be instantiated
@ContextConfiguration(classes = AppConfig.class)
public class EmployeeServiceRunnerIntegrationTest {

    //    with @Autowired annotation we can access "EmployeeService" Spring bean class ! (it was implicitly instantiated in our Appconfig class . )
    @Autowired
    EmployeeService employeeService;

    //    Our testcase should run with "SpringJUnit4ClassRunner"
    @Test
    public void testSaveAndListEmployee() {
        employeeService.saveEmployee(" John         ");
        assertEquals(List.of("John"), employeeService.getEmployeeList());
    }


//    This is what the annotation "@ContextConfiguration" does in the background = initializes the "context" in which
//    our Spring bean classes will be then instantiated.
//    @Test
//    public void testSaveAndListEmployee() {
//        try (AnnotationConfigApplicationContext context =
//                     new AnnotationConfigApplicationContext(AppConfig.class)) {
//            EmployeeService employeeService = context.getBean(EmployeeService.class);
//            employeeService.saveEmployee(" John         ");
//            assertEquals(List.of("John"), employeeService.getEmployeeList());
//        }

}

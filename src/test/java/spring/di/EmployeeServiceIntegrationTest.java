package spring.di;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.Assert.assertEquals;

// Integration testing = testing multiple components at the same time without utilizing Annotations from Spring framework
public class EmployeeServiceIntegrationTest {


    @Test
    public void testSaveAndListEmployee() {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeService employeeService = context.getBean(EmployeeService.class);
            employeeService.saveEmployee(" John         ");
            assertEquals(List.of("John"), employeeService.getEmployeeList());
        }

    }


}

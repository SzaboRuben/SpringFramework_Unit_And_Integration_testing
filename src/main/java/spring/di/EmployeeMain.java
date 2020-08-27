package spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

//            EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
//            employeeDao.saveEmployee("John Doe");
//            System.out.println(employeeDao.getEmployeeList());

            EmployeeService employeeService = context.getBean(EmployeeService.class);
            employeeService.saveEmployee(" Banana Joe                  ");
            System.out.println(employeeService.getEmployeeList());

        }

    }

}

package spring.di;

import java.util.List;


public class EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void saveEmployee(String employee) {
//        BL
        String trimmedName = employee.trim();
        employeeDao.saveEmployee(trimmedName);
    }

    public List<String> getEmployeeList() {
        return employeeDao.getEmployeeList();
    }
}

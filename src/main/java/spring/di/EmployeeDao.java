package spring.di;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDao {

    private List<String> employeeList = Collections.synchronizedList(new ArrayList<String>());

    public void saveEmployee(String employee){
        employeeList.add(employee);
    }

    public List<String> getEmployeeList(){
        return new ArrayList<String>(employeeList);
    }

}

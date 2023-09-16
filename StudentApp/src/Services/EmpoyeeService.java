package Services;

import java.util.*;
import Domen.*;

public class EmpoyeeService implements iPersonService<Employee>{
    private int count;
    private List<Employee> employees;

    public EmpoyeeService() {
        this.employees = new ArrayList<>(null);
    }

    @Override
    public List<Employee> getAll() {
    return employees;
    }

    @Override
    public void create(String name, int age) {
      Employee epls = new Employee(name, age, "basic");
      count++;
      employees.add(epls);

    }

    public void sortByFIO() 
    {
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employees.sort(persComp);
    }
    
}


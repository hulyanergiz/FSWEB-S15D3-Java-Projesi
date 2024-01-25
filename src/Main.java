import com.workintech.company.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees=new LinkedList<>();
        Employee e1=new Employee(1,"ali","veli");
        Employee e2=new Employee(1,"ali","veli");
        Employee e3=new Employee(2,"ahmet","mehmet");
        Employee e4=new Employee(3,"ege","deniz");
        Employee e5=new Employee(4,"lila","beyaz");
        Employee e6=new Employee(4,"lila","beyaz");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        System.out.println("employees: "+employees);

        List<Employee> repeatedEmployees=new LinkedList<>();
        Map<Integer,Employee> uniqueEmployees=new HashMap<>();

        Iterator<Employee> employeeIterator= employees.iterator();
        while(employeeIterator.hasNext()){
            Employee employee=employeeIterator.next();
            if(employee==null){
                employeeIterator.remove();
                continue;
            }
            if(uniqueEmployees.containsKey(employee.getId())){
                repeatedEmployees.add(employee);
                employeeIterator.remove();
            }else{
                uniqueEmployees.put(employee.getId(), employee);
            }
        }
        System.out.println("unique employees: "+uniqueEmployees);
        System.out.println("repeated employees: "+repeatedEmployees);





    }
}
package Inherit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anna", 8500);
        Employee employee1 = new Employee("Anna", 8500);
        //System.out.println(employee.toString());
        //System.out.println(employee1.toString());

        if (employee.equals(employee1))
        {
            System.out.println("true");
        }
         else System.out.println("false");

        ArrayList<Employee>list=new ArrayList<>();
        list.add(new Employee("Anna", 35));
        list.add(new Employee("Annahit",55000));
        //for(Employee e:list)

            System.out.println(list.toString());


    }
}

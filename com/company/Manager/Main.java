package Manager;

public class Main {
    public static void main(String args[])
    {
        Employee emp=new Employee("Anna", 25,5000);
        Manager man= new Manager("Vahan",35,5364123,"Midlle",5);
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getSalary());
         Manager manger=new Manager();
    }

}

package Manager;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary)
    {
        System.out.println("start creation employee");
        this.name=name;
        this.age=age;
        this.salary=salary;
        System.out.println("end of creation employee");
    }
    public Employee()
    {
        System.out.println("in deafult constructor of Employee");

    }
    public void setEmployee(String name, int age, double salary)
    {
        this.name=name;
        this.salary=salary;
        if(age>0 && age<100)
        {
            this.age=age;
        }

    }
    public  String getName()
    {
        return name;

    }
    public int getAge()
    {
        return age;
    }
    public double getSalary()
    {
        return salary;
    }
}

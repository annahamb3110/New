package Manager;

public class Manager extends Employee {
    public String englishLevel;
    private double coefficient;

   public Manager(String name,int age,double salary,String englsihLevel, double coefficient )
    {
       super(name,age,salary);
        System.out.println("Starting manager object creation");
        this.englishLevel=englsihLevel;
        this.coefficient=coefficient;
        System.out.println("Ending manager object creation");
    }
    public Manager()
    {
        System.out.println("in default constructor of Manager");
    }
    public String getEnglishLevel()
    {
        return englishLevel;
    }
    public double getCoefficient()
    {
        return  coefficient;
    }
    public void printEmployeeSalaries(Employee []employees)
    {
        for(int i=0; i<5;i++)
        {
            System.out.println(employees[i].getSalary());
            System.out.println(employees[i].getAge());
            System.out.println(employees[i].getName());
        }

    }
}

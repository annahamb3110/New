package Inherit;

public class Manager extends Employee{


    private String englishLevel;
    private double coefficient;


    public Manager(String fullName, double salary, String englishLevel, double coefficient) {
         super(fullName, salary);
        System.out.println("Manager.Manager constuctor");
        this.englishLevel = englishLevel;
        this.coefficient = coefficient;
        System.out.println("Ending this constructor");
    }

    public Manager()
    {
        System.out.println("In default constructor");
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public double getCoefficient() {
        return coefficient;
    }
    public void PrintsEmployeeSalary(Employee [] employees)
    {
        for(Employee e:employees)
        {
            System.out.println(e.getSalary());
        }

    }
}
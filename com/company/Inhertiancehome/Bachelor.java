package Inhertiancehome;

public class Bachelor {
  private  String fullName;
    private int age;
 private   double point;


    Bachelor(String fullName, int age, double point)
    {
        this.fullName=fullName;
        if(age>16 && age<35) {
            this.age = age;
        }
        else
        {
            System.out.println("you are too young");
        }
        this.point=point;
    }

    public String getFullName()
    {
        return fullName;
    }
    public int getAge()
    {
        return age;
    }
public double getPoint()
    {
        return point;

    }

}

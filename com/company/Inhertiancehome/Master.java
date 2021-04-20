package Inhertiancehome;

public class Master extends Bachelor {
    String degree;
    String newSkills;

    Master(String fullName, int age, double point, String degree, String newSkills) {
        super(fullName, age, point);
        if (point > 100) {
         this.degree = degree;
        }
        else {
            System.out.println("you don't have enough points");
            this.degree="you failed";
        }
          this.newSkills=newSkills;

    }

    public String getDegree()
    {
        return degree;
    }
    public String getNewSkills()
    {
        return  newSkills;
    }
     public void printBachelorPoints(Bachelor []bachelors)

     {
         for(Bachelor b:bachelors)
         {
             System.out.println(b.getPoint());
                 }

     }
}

package Student;

public class Student {
    static int  id=0;
    public String fullName;
    private   int age;
     public  String address;
     private int studentID;


    public  Student(String fullName, String address, int age)
   {

       this.fullName=fullName;
       this.address=address;
       if(age>0 && age<100)
       {
           this.age = age;
       }
       else
       {
           System.out.println("Wrong input");
       }

       id++;
       this.studentID=id;

       }


    public String getStudent() {

        String res=studentID+" "+fullName+" "+address+" "+ age+" ";
        return res;


    }


}

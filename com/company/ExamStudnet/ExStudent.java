package ExamStudnet;

public class ExStudent {
    private String name;
    private int age;
    static int id=0;
  private int  studentID;

    public ExStudent(String name, int age) {
        this.name = name;

        if(age>0 && age<100) {
            this.age=age;
        }
        else {
            System.out.println("Wrong input");
        }

               this.studentID=id++;
    }
    public String getResult()
    {
        String res="name="+name+"age="+age+"studentID="+studentID;
        return res;
    }
}

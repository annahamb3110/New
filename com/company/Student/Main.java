package Student;

public class Main
{
    public static void main(String[] args)
    {
        Student S1=new Student("Anna", "Yerevan",25);
        Student S2=new Student("Vahan", "Yerevan",36);
        Student S3=new Student("Lusine", "Abovyan",55);


        System.out.println(S1.getStudent());

        System.out.println(S2.getStudent());
        System.out.println(S3.getStudent());



    }
}

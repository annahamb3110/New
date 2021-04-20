package ExamStudnet;

public class main {
    public static void main(String[] args) {
        ExStudent Student=new ExStudent("Anna",35);
        ExStudent Student1=new ExStudent("Vacho",25);
        ExStudent Student2=new ExStudent("Vacho",25);
        System.out.println(Student.getResult());
        System.out.println(Student1.getResult());
        System.out.println(Student2.getResult());
    }
}

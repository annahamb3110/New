package Inhertiancehome;



public class main {
    public static void main(String []args)
    {
        Bachelor bachelor=new Bachelor("Anna",26,56);
      Master master=new Master("Louise",28, 99, "Master", "Java");
        System.out.println(master.getFullName());;
        System.out.println(master.getAge());
        System.out.println(master.getPoint());
        System.out.println(master.getDegree());
    }

}

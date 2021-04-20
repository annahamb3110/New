import java.util.Scanner;

public class Nermucel {
    public static void main(String[] args) {
        System.out.println("Enter number");
        int Sum=0;
        int max=0;


        for (int i = 0; i < 5; i++) {

   Scanner commandline=new Scanner(System.in);

      int number=commandline.nextInt();
      Sum=Sum+number;
      if(number>max)
      {
          max=number;
      }
    }
        System.out.println(Sum);
        System.out.println(max);
}
}

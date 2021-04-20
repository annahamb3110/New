import java.util.Scanner;

public class tvernew {
    public static void main(String[] args) {
        Scanner commandline = new Scanner(System.in);
        System.out.println("Enter number");
        int number = commandline.nextInt();
        int count = 0;
        int mnacord;
        while (number!= 0) {
            // num = num/10
            mnacord=number%10;
            number=number/ 10;


           // System.out.println("number="+number);
            System.out.println(mnacord);

            ++count;
        }

        System.out.println("Number of digits: " + count);


    }


    }


import java.util.Scanner;
public class Fibonachi {

    public static void main(String[] args) {
        Scanner comandline=new Scanner(System.in);
        System.out.println("Enter positive number");
        int n=comandline.nextInt();
        if(n>0)
        {
            fibonachi(n);
        }
   else System.out.println("wrong input");

    }
        static void fibonachi ( int n)
        {
            int[] posArr = new int[n];
            posArr[0] = 0;
            System.out.println(posArr[0]);
            posArr[1] = 1;
            System.out.println(posArr[1]);


            if (n > 0) {
                for (int i = 2; i < n; i++) {
                    posArr[i] = posArr[i - 1] + posArr[i - 2];
                    System.out.println(posArr[i]);
                }

            }
        }
    }

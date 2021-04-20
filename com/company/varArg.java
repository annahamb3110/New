public class varArg {

    public static void main(String[] args) {

        funcVararg(1.2, 2.2, 3.1,4.5,6.6);
        funcVararg(3.3,5.5);
    }


    static int funcVararg(double... args) {
        double Sum = 0.0;

       //System.out.println(args.length);
        for (double i : args) {
            System.out.print(" "+i);
            Sum = Sum + i;

        }
          int Sum1=(int)Sum;

        System.out.println("The sum is "+Sum);
        System.out.println("The integer part of Sum is "+ Sum1);
          return Sum1;
    }
}



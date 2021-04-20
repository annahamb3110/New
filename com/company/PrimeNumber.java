public class PrimeNumber {

 public static void main(String[] args) {
     int []array={0,1,5,2,3,6,9,7,810};
     boolean f=true;
for (int i=0;i<array.length;i++) {
    if (array[i] == 0 || array[i] == 1) {
        System.out.println(array[i] + " It is not prime number");
        //boolean f=false;

    }

    for (int j = 2; j < array[i] / 2; j++) {
        if (array[i] % j == 0) {
            f = false;

            System.out.println(array[i]);
            //System.out.println(f);
        }
    }
}
if(f!=true){

    System.out.println("It is prime number");
}
else  System.out.println("It is not prime number");


    }
}
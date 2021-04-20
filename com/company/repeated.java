public class repeated {
    public static void main(String[] args) {
        int[] arr = {8, 7, 8, 7, 9, 15, 8,9, 22,22};
        //int j = 0;
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < arr.length; i++)
        {
            for (j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }


       /* for (int k = j; k < array.length; k++) {
            System.out.println(array[k]);*/
 //  }



}

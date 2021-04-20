public class detect {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10,11,13};
         detect(array);
    }

    static void detect(int []arr)
    {
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if (arr[i+1]!= (arr[i]+1))
            {
                  System.out.println("Missing elemnt is   "+(arr[i]+1));
                flag = false;
                break;
            }

        }
            if(flag==true)
            {
                  System.out.println("OK");
             }

        }

    }




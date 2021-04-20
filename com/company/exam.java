public class exam {


    public static void main(String[] args) {
        String str="1111110100";
        String str1=" ";
        String str2=" ";
        int j=0;
        int sum=0;
        int sum1=0;
         for(int i=0;i<str.length();i++) {
          if(str.charAt(i)=='0')
             {
           sum=sum+1;
            }

        if(str.charAt(i)=='1')
        {
            sum1 = sum1 + 1;
        }

    }
        System.out.println(sum);
        System.out.println(sum1);
        for(int i=0;i<sum;i++)
        {
          str1=str1+"0";
        }
        for(int i=0;i<sum1;i++)
        {
            str2=str2+"1";
        }
        System.out.println(str1+str2);
    }


}

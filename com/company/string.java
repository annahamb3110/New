public class string {
    public static void main(String[] args) {

        String str = "ksdfghj";
        String str1="bnmk";
       String str3 = "Hello world ape jan";
       String str4="babaelbbbbbkrel";


        String[] scripts = new String [] {str,str1,str3,str4};
     for (int i = 0; i < scripts.length; i++)
     {
         checkString(scripts[i]);
     }


    }
      static void checkString(String str) {

          int flag = 0;
          for (int i = 1; i < str.length(); i++) {
              if (str.charAt(0) == str.charAt(i)) {
                  System.out.println(str.charAt(i));
                  flag = 1;
                  System.out.println(flag);
                 continue;
              }
          }

          if (flag == 1) {
              System.out.println(str);
          } else System.out.println("NO repeated symbol");
      }

}

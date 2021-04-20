public class whilelesson {
    public static void main(String[] args) {

String str="abba";
String str1="qwerty";
String str2="njkiop";
String str3="klmnb";

        posStr(str);
      // posStr(str1);
      // posStr(str2);
       posStr(str3);
}
static void posStr(String str)
{
    int flag =0;
    for(int i = 0;i<str.length()-1;i++)

    {
        if (str.charAt(0) == str.charAt(i))
        {
           flag = 1;
     return;
        }

    }
    System.out.println(flag);
    if(flag==1)
        System.out.println(str);

    else System.out.println("NO repeted symbol");
}



}

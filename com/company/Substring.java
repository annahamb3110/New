public class Substring {
    public static void main(String[] args) {
        int beginIndex=3;
        int endIndex=7;
        String str ="Haghoxtuyun";
        System.out.println(func(beginIndex,str));
        System.out.println(func(beginIndex,endIndex,str));


}
static String func(int beginIndex,String str)
{
  String  exp=" ";
if(beginIndex>0)
{
    for (int i = beginIndex; i < str.length(); i++) {
        exp = exp + str.charAt(i);

    }
}
 return exp;
}
    static String func(int beginIndex,int endIndex,String str)
    {  String exp="";
        if(endIndex<=str.length())
        {
        for (int i=beginIndex; i< endIndex;i++)
        {
            exp=exp+str.charAt(i);
        }
        }
         return exp;
    }


}
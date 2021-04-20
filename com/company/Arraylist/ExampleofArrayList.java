package Arraylist;
import java.util.*;

 public class ExampleofArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Integer>list2=new ArrayList<Integer>();
        for(int i=0;i<5;i++)
        {
            list2.add(i);
        }
        System.out.println(list2);
        list.add("Anna");
        list.add("VAcho");
        list.add("Louise");
        System.out.println(list.iterator());
        Iterator<String> iter = list.iterator();
        System.out.println(list.size());
        list.contains("Anna");
        boolean b = list.contains("debil");
        System.out.println(b);
        LinkedList<String> LL = new LinkedList<String>();
        LL.add("Anahit");
        LL.add("Mananik");
        System.out.println(LL);
        LL.addFirst("Anulik");
        LL.addLast("marqat");
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
        LL.set(2, "klisa");
        System.out.println(LL);
        for (String str : LL) {
            System.out.println(str);

        }
    }
}

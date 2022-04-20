import java.util.*;
import java.util.Iterator;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Harsh");
        a.add("Aditya");
        a.add("Yashwant");
        //one of the way to travse
//        Iterator i = a.iterator();
//        while(i.hasNext())
//        {
//            System.out.print(i.next()+" ");
//        }

        //second way to travse the list:Forward Traversal
        for(String str:a)
        {
            System.out.print(str+"\t"+str.length()+"\t");
            //to reverse the string we use string buffer
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

        System.out.println("+++++++++++++++++++++++++++++++");

        //backward traversal of collection LISTITERATOR
        ListIterator<String> lite = a.listIterator(a.size());
        while(lite.hasPrevious())
        {
            System.out.println(lite.previous());
        }

        //Enumeration



        System.out.println("+++++++++++++++++++++++");
        //for-Each method
        a.forEach(e->{
            System.out.println(e);
        });
    }
}

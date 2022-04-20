import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class StartCide {
    public static void main(String[] args) {
        System.out.println("Welcme to java framework");
        /*
        creating collection
        1) Type Safe - same type of elements(objects) are added to collection
        2) Untype Safe - different type of elements are added to collection
         */
        //Type safe collection
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        System.out.println(al);
        System.out.println(al.contains(10));




        //Untype Safe

    }
}

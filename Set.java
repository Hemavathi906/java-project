import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet hs =new HashSet();
        hs.add(5);
        hs.add(10);
        hs.add(15);
        hs.add(20);
        hs.add(25);
        hs.add(25);
        System.out.println(hs);

        LinkedHashSet ls =new LinkedHashSet();
        ls.add(3);
        ls.add(4);
        ls.add(15);
        ls.add(24);
        ls.add(6);
        ls.add(3);
        System.out.println(ls);

        TreeSet ts= new TreeSet();
        ts.add(3);
        ts.add(4);
        ts.add(15);
        ts.add(6);
        ts.add(24);
        ts.add(3);
        System.out.println(ts);



            }
    
}

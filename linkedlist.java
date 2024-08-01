import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(5);
        l.add(6);
        l.add("hema");
        l.add(true);
        System.out.println(l);
        l.addFirst(100);
        System.out.println("before poll"+l);
        System.out.println(l.poll());
        System.out.println("After poll"+l);
        l.offer(45);
        System.out.println("After offer"+l);
        
    }
    
}

package Tutorial.LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Integer> lk = new LinkedList();

        lk.add(1);
        lk.add(2);
        lk.add(3);
        lk.add(4);
        System.out.println(lk);


        lk.removeLast();
        lk.removeFirst();
        System.out.println(lk);

        lk.set(0, 0);
        
        System.out.println(lk);
        System.out.println(lk.getFirst());
        System.out.println(lk.getLast());

        // ArrayList is good for storing data
        // LinkedList is good for manipulating data
        
    }
}

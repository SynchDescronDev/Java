package Tutorial.ArrayLists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.set(3, "e");

        for(String i : arrayList){
            System.out.println(i);
        }
        System.out.println("***************************");
        arrayList.remove(0);
        for(String i: arrayList){
            System.out.println(i);
        }
        System.out.println(arrayList);

        System.out.println(arrayList.size());
        arrayList.clear();

        System.out.println(arrayList);

        // can be implemented to wrapper classes as well.


    }
}

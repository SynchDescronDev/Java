package Tutorial.Iterators;

import java.util.ArrayList;
import java.util.Iterator;



public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        for(int i=1;i<11;i++){
            nums.add(i);
        }

        Iterator<Integer> itr = nums.iterator();
        
        while(itr.hasNext()){
            Integer i = itr.next();
            if(i%2 ==0){
                itr.remove();
            }
        }
        System.out.println(nums);

    }
}

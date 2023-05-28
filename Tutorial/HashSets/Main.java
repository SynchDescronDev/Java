package Tutorial.HashSets;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        HashSet<Integer> nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        System.out.println(nums);

        System.out.println(nums.contains(1));
    }
}

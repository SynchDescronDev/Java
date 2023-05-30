package LeetCode.NumberOfCommonFactors;

import java.util.ArrayList;

class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=Math.max(a, b);i++){
            if(a % i == 0 && b % i == 0){
                arr.add(i);
            }
        }
       return arr.size();
    }
}
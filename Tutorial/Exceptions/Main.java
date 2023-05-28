package Tutorial.Exceptions;

public class Main {
    public static void main(String[] args) {
        try{
            Integer[] nums = {1,2,3,4,5};
            System.out.println(nums[5]);
        }catch(Exception e){
            System.out.println("Error");

            checkAge(20);
            checkAge(16);
        }

        
    }

    static void checkAge(int x){
        if(x <18){
            throw new ArithmeticException("Access denied");
        }else{
            System.out.println("Access granted");
        }
    }
}

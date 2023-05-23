package Tutorial.IfElseFOR;

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }


        
        int year = 1900;
        boolean leap = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leap = true;
                }else{
                    leap = false;
                }
            }
        }
        else{
            leap = true;
        }

        if(leap){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }


        int time = 20;
        String val = (time < 25) ? "True statement" : "False Statement"; // ternary operator
        System.out.println(val);
        
    }
}

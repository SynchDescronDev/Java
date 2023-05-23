package Tutorial.Switch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int randomValue = random.nextInt(7)+1;

        switch (randomValue) {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;
            default:System.out.println("Days of the week 1-7 Enter a valid value.");
                break;
        }
        
        char c = 'b';

        switch (c) {
            case 'a':
                System.out.println("First letter");
                break;
            case 'b':
                System.out.println("Second letter");
                break;
            case 'c':
            System.out.println("Third letter");
                break;
            default:System.out.println("Enter valid character");
                break;
        }


    }
}

package Tutorial.TypeCasting;

 public class Main {
    public static void main(String[] args) {
        int intNumber = 5;
        double doubleNumber = intNumber;

        System.out.println("Integer value of intNumber :"+intNumber);
        System.out.println("Double value of intNumber :"+doubleNumber);

        double myDouble = 5.0;
        int myInt = (int)myDouble;

        System.out.println("Double value of myDouble :"+myDouble);
        System.out.println("Integer value of myDouble :"+myInt);

        char character = 'A';
        String value = String.valueOf(character);

        System.out.println("Char value of character :"+character);
        System.out.println("String value of character :"+value);

        String myValue = String.valueOf(myDouble);

        System.out.println("Double value of myDouble :"+myDouble);
        System.out.println("String value of myDouble :"+myValue);

    }
}

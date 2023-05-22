package Tutorial.DataTypes;

  public class Main {
    public static void main(String[] args) {
        

        byte byteNumber = 10;
        short shortNumber = 100;
        int intNumber = 1_000;
        long longNumber = 10_000;
        float floatNumber = 100_000.23F;
        double doubleNumber = 1_000_000.53;
        char character = 'A';
        boolean isTrue = true;
        String value = "Hello World!";

        System.out.println("Byte :"+byteNumber+".\tType :"+((Object)byteNumber).getClass().getSimpleName());
        System.out.println("Short :"+shortNumber+".\tType :"+((Object)shortNumber).getClass().getSimpleName());
        System.out.println("Int :"+intNumber+"\tType :"+((Object)intNumber).getClass().getSimpleName());
        System.out.println("Long :"+longNumber+"\tType :"+((Object)longNumber).getClass().getSimpleName());
        System.out.println("Float :"+floatNumber+"\tType :"+((Object)floatNumber).getClass().getSimpleName());
        System.out.println("Double :"+doubleNumber+"\tType :"+((Object)doubleNumber).getClass().getSimpleName());
        System.out.println("Character :"+character+"\tType :"+((Object)character).getClass().getSimpleName());
        System.out.println("Boolean :"+isTrue+"\tType :"+((Object)isTrue).getClass().getSimpleName());
        System.out.println("String :"+value+"\tType :"+((Object)value).getClass().getSimpleName());




    }
}

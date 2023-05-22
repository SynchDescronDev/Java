package Tutorial.Operators;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = -2;

        int sum,sub,mul,div,mod;
        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = b / a;
        mod = a % c;

        System.out.println("a + b :"+sum);
        System.out.println("a - b :"+sub);
        System.out.println("a * c :"+mul);
        System.out.println("b / a :"+div);
        System.out.println("a % c :"+mod);

        System.out.println("Value of a :"+a); // 5
        System.out.println("Value of a preincrement :"+ ++a); // 6 first increment the value then display
        System.out.println("Value of a after increment : "+ a++); // 6 // first display value then increment
        System.out.println("Value of a becomes :"+a); // 7




        

    }
}

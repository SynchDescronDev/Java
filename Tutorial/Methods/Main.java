package Tutorial.Methods;

class Main{

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myInt();
        myInt();
        sayHi("Rachel");
        sayHi("Micheal");
        sum(1,2);
        sum(3, 4);
        sum(2, 4, 12);

    }

    static void myMethod(){
        System.out.println("Void method doesn't return anything");
    }
    static int myInt(){
        int x = 5;
        System.out.println(x);
        return x;
    }
    static void sayHi(String name){
        System.out.println("Hello "+name);
    }
    static void sum(int x,int y){
        int sum = x+y;
        System.out.println("x+y :"+sum);
    }
    static void sum(int x,int y,int z){
        int sum = x+y+z;
        System.out.println("x+y+z :"+sum);
    }
    

}
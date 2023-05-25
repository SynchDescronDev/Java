package Tutorial.Recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int x){
        if(x>0){
            
            return x + sum(x - 1);
        }else{
            return 0;
        }
    }
}

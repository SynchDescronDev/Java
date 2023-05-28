package Tutorial.Threads;

public class Main {
    public static void main(String[] args) {
        try {
            for(int i=1;i<11;i++){
                System.out.println(Math.pow(2, i));
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Thread executed successfully");
        }
    }
}

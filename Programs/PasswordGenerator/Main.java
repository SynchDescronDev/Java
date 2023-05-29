package Programs.PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userPassword;
        
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();


        for(int i=33;i<=126;i++){
            str.append((char)i);
        }
      
        System.out.println("Enter how many characters you want in your password");
        userPassword = scanner.nextInt();
        if(userPassword<1){
            System.out.println("Please enter a value bigger than 1");
        }
        if(userPassword>=1){
        System.out.println("Here is your randomly generated password");
        for(int i=1;i<=userPassword;i++){
                str2.setLength(userPassword);
                str2.append(str.charAt(random.nextInt(93)+1));
                System.out.print(str2);
            }
        }
        

        
        scanner.close();
      

        }
    }

package Tutorial.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("Tutorial//Files//filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("I am learning Java.It is fun and useful.");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          
        }
}

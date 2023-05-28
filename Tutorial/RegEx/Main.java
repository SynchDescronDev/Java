package Tutorial.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("SynchDescron", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("SynchDescron is a developer");
        boolean found = matcher.find();
        if(found){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }
    }
}

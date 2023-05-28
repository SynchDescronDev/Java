package Tutorial.HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> obj = new HashMap();
        obj.put("Tom", "Jerry");
        obj.put("Key", "Value");
        obj.put("Micheal", "Jordan");

        System.out.println(obj);

        System.out.println(obj.get("Micheal"));
        
      
        System.out.println(obj.size());

        for(String i : obj.keySet()){
            System.out.println("Keys : "+i+" Values : "+obj.get(i));
        }
    }
    
}

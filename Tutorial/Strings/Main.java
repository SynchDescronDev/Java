package Tutorial.Strings;

public class Main {
    public static void main(String[] args) {
        
        String var = "Hello";
        System.out.println("Length of var : "+var.length());
        System.out.println("Char at 0 : "+var.charAt(0));
        System.out.println("Substring of var : "+var.substring(0, 4));
        System.out.println("Substring of var : "+var.substring(1));
        System.out.println("Index of specified character in var : "+var.indexOf("o"));
        String[] split = var.split("l");
        for (String string : split) {
            System.out.println("String split : "+string);
        }
        System.out.println("Last index of l in var : "+var.lastIndexOf("l"));
        System.out.println("Code point at index 0 : "+var.codePointAt(0));
        System.out.println("Code point before of index 1 :"+var.codePointBefore(1));
        System.out.println("Number of code points specified in var : "+var.codePointCount(0, 5));
        System.out.println("Compares two strings lexicographgically :"+var.compareTo("He"));
        System.out.println("Compares two strings lexicographgically ignores case :"+var.compareToIgnoreCase("he"));
        System.out.println("Concatanes two strings : "+var.concat(" World!"));
        System.out.println("Returns true if var contains specified char sequence : "+var.contains("el"));
        System.out.println("Returns true if var equals specified char sequence : "+var.contentEquals("Hello"));
        System.out.println("Returns true if var content equals specified string buffer : "+var.contentEquals("ee"));
        System.out.println("Returns true if length() == 0 : "+var.isEmpty());
        System.out.println("Returns true if var content ends with specified suffix : "+var.endsWith("lo"));
        System.out.println("Replaces specified regex with specified replacement : "+var.replaceAll("l", "y"));
        System.out.println("Replaces targetted char sequence with specified replacement : "+var.replace("l", "j"));
        System.out.println("Convert all characters of string to lowercase : "+var.toLowerCase());
        System.out.println("Converts all characters of string to uppercase : "+var.toUpperCase());
        System.out.println("Returns true if string contains only whitespaces : "+var.isBlank());
        System.out.println("Returns true if specified object contains same sequence of characters with var :"+var.equals("hello"));
        String formatted = String.format("Hello %s","World");
        System.out.println("Returns formatted string :"+formatted);
        System.out.println("Returns hash code of specified string :"+var.hashCode());
        System.out.println("Compares 2 strings ignores case :"+var.equalsIgnoreCase("hello"));
        System.out.println("Adjust indentation based on value :"+var.indent(5));
        System.out.println("Returns canonical representation of string :"+var.intern());
        System.out.println("Tells whether or not this string matches the given regular expression "+var.matches(formatted));
        System.out.println("Repeats concatenated version of string according to specified value :"+var.repeat(3));
        System.out.println("Returns the runtime class of this object : "+var.getClass());
        System.out.println("Returns string with all leading and trailing white spaces removed :"+"  Hello  ".strip());
        System.out.println("This object (which is already a string!) is itself returned :"+var.toString());



        
    }
}

package Tutorial.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[5];

        strArray[0] = "Day 1";
        strArray[1] = "Day 2";
        strArray[2] = "Day 3";
        strArray[3] = "Day 4";
        strArray[4] = "Day 5";
        

        for (String string : strArray) {
                System.out.println(string);
        }

        String[] stringArray = {"Day 1","Day 2","Day 3","Day 4","Day 5"};
        for (String string : stringArray) {
            System.out.println(string);
        }

        System.out.println(strArray.length);

        int[] intArray = {1,2,3,4,5};
        for (int i : intArray) {
            System.out.println(i);
        }

        char[] charArray = {'H','e','l','l','o',' ','W','o','r','l','d','!'};
        for(char i : charArray){
            System.out.print(i);
        }
        System.out.println();
        Double[][] arr = new Double[2][2];

        arr[0][0] = 0.0;
        arr[0][1] = 0.1;
        arr[1][0] = 1.0;
        arr[1][1] = 1.1;

        for(int i=0;i<2;i++){
            for(int j=0;j<=i;j++){
                System.out.println(arr[i][j]);
            }
        }









    }
}

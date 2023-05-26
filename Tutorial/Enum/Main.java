package Tutorial.Enum;

public class Main {

    enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }
    public static void main(String[] args) {
        Days days = Days.FRIDAY;
        switch(days){

            case MONDAY:System.out.println("Good to be back");
            break;
            case WEDNESDAY:System.out.println("Working");
            break;
            case FRIDAY:System.out.println("No work tomorrow");
            break;
            default:System.out.println("Enter valid info");
            break;
        }

        for(Days i : Days.values()){
            System.out.println(i);
        }
    }
}

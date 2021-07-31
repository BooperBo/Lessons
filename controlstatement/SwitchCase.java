package controlstatement;

public class SwitchCase {

    public static void main(String[] args) {

        String dayOfTheWeek = "Monday";
        switch (dayOfTheWeek) {
            case "Monday":
                System.out.println("This is the first working day");
                break;
            case "Tuesday":
                System.out.println("This is the second working day");
                break;
            case "Wednesday":
                System.out.println("This is the third working day");
                break;
            case "Thursday":
                System.out.println("This is the fourth working day");
                break;
            case "Friday":
                System.out.println("This is the fifth working day");
            case "Saturday":
            case "Sunday":
                System.out.println("Finally weekend");

            default:
                System.out.println("Not a day of the week");

        }
        System.out.println("Final string");
    }

}

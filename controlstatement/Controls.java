package controlstatement;

public class Controls {

    public static void main(String[] args) {

        int i = 10;
        {
            int k = 15;
            System.out.println("I = " + i);
            System.out.println("K = " + k);
        }

        int testScore = 95;
        System.out.println("you've got");
        if (testScore > 90) {
            System.out.println("an Excellent");
        } else if (testScore >= 75) {
            System.out.println("a Good");
        } else if (testScore >= 60) {
            System.out.println("a Satisfactory");
        } else {
            System.out.println("an Bad");
        }
        System.out.println("mark");

    }
}

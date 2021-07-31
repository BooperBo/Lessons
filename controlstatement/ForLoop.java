package controlstatement;

public class ForLoop {
    public static void main(String[] args) {

        int factorialLimit = 10;
        int factorial = 1;
        for (int i = 0; i < factorialLimit; i++) {
            factorial *= 1;
            System.out.println(factorial);
        }
        System.out.println(factorial);

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        int i = 10;
        while (i>10){
            System.out.println(i);
            i--;
        }
    }
}

package methods;

public class Methods {

    public static void main(String[] args) {

        printMessage("Denis");

        int a = 5;
        int b = 10;
        System.out.println("Rectangle square = " + calcRectangleSquare(a,b));
        System.out.println("Square = " + calcSquare(b));
        System.out.println("Sum of squares= " + (calcSquare(b)+calcRectangleSquare(a,b)));
    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!");
    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }
}

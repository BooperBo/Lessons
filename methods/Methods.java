package methods;

public class Methods {

    public static void main(String[] args) {

        printMessage("Denis");
        System.out.println("Rectangle square = " + calcRectangleSquare(5, 10));
        System.out.println("Square = " + calcSquare(10));
        System.out.println("Sum of squares= " + (calcSquare(10) + calcRectangleSquare(5, 10)));


        String str = "I like black coffee";
        String str3 = "I like coffee!!!";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String str2 = "I like coffee";
        String str4 = new String("I like coffee");
        String substring = str3.substring(0,13);
        System.out.println("Substring = " + substring);

        boolean b = str2.equals(substring);
        System.out.println(b);

        boolean like = str.endsWith("fee!");
        System.out.println(like);

        System.out.println(str.replace("black", "white"));

        System.out.println(str3.indexOf("abc"));
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

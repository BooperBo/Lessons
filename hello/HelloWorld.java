package Lessons.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 346346L;
        float myFloatValue = 23.56f;
        double myDoubleValue = 23.54d;
        double sum = a + b + c + myDoubleValue + myFloatValue + myLongValue;
        float floatResult = myFloatValue / 2;
        System.out.println("floatResult" + floatResult);

        System.out.println("sum = " + sum);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("c = " + c);
    }
}

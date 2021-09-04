package generics;

public class GenericsMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 0, 8, 5, 6};
        Double[] doubleArray = {0.234, 6.45, 9.034, 1.345, 4.675};
        String[] stringArray = {"abc", "vfr", "rtw", "ert"};


        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
    }

    private static void printArray(Integer[] intArray) {
        System.out.println("Non generics methods called");
        for (Integer element : intArray) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }
    private static void printArray(Double[] intArray) {
        System.out.println("Non generics methods called");
        for (Double element : intArray) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }
    private static void printArray(String[] intArray) {
        System.out.println("Non generics methods called");
        for (String element : intArray) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }




}

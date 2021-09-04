package generics;

public class GenericsMethods {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 0, 8, 5, 6};
        Double[] doubleArray = {0.234, 6.45, 9.034, 1.345, 4.675};
        String[] stringArray = {"abc", "vfr", "rtw", "ert"};


        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println("Max for array of integers "+findMax(intArray));
        System.out.println("Max for array of integers "+findMax(doubleArray));
        System.out.println("Max for array of integers "+findMax(stringArray));
    }

    private static <T> void printArray(T[] intArray) {
        System.out.println("Non generics methods called");
        for (T element : intArray) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    private static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T e : array) {
            if (e.compareTo(max)>0) {
                max = e;

            }
        }
        return max;
    }

}

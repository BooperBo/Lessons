package collections;

import java.util.Scanner;

public class ArrayLauncher {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = new int[8];
        System.out.println("Enter 8 integer elements");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Next element");
            myArray[j] = scanner.nextInt();
        }
        sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Elements #" + i + " = " + myArray[i]);
        }


    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

//    10, 5, 16, 4
//     5, 10 ,16 ,4
//    5, 10 ,4, 16
//    5, 4, 10, 16

}

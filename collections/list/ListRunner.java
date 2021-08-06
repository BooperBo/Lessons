package collections.list;

import java.util.Arrays;

public class ListRunner {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        int[] nArray = new int[10];
        System.arraycopy(array, 0, nArray, 0, array.length);
        nArray[6] = 100;
        System.out.println(Arrays.toString(nArray));
    }
}
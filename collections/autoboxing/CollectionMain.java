package collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {


        String[] colors = {"yellow", "green", "black"};

        List<String> list = new LinkedList<>(Arrays.asList(colors));
        list.add("red");

        colors = list.toArray(new String[list.size()]);

        for (int i = 0; i < colors.length; i++) {

            System.out.println(colors[i]);
        }

    }
}

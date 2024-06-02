package collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        /*

        Ordered Collection.
        Allows Duplicates.
        Elements can be accessed using index.

        */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("King Fruit : " + fruits.get(0));

        System.out.println("King Fruit : " + fruits.get(1));
        System.out.println("King Fruit : " + fruits.get(2));



    }

}

package collections;

import java.util.HashSet;

public class HashSetExample {

    /*
         Does not allow duplicate elements
     */

    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("USA");
//        System.out.println(size);

        for (int i = 0; i < 5; i++) {

            countries.add("India");
            // cannot enter duplicates

        }

        // Iterating over elements
        for (String country : countries) {
            System.out.println(country);
        }
        int size = countries.size();


        System.out.println(size);
    }



}

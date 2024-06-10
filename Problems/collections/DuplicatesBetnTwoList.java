package collections;

import java.util.ArrayList;
import java.util.Objects;

public class DuplicatesBetnTwoList {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");
        list1.add("date");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("elderberry");
        list2.add("fig");
        list2.add("grape");
        list2.add("banana");
        list2.add("apple");

        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {

            for (int j = 0; j < list2.size(); j++) {

                if (Objects.equals(list1.get(i), list2.get(j))) {
                    duplicates.add(list1.get(i));
                }

            }

        }
        System.out.println(duplicates);
    }

}

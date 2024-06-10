package collections;

import java.util.HashMap;

public class HashMap_Equality {

    public static void main(String[] args) {

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        HashMap<String,Integer> map2 = new HashMap<>();

        map2.put("A", 1);
        map2.put("B", 2);
        map2.put("C", 4);

        boolean isHashMapsSame = map2.equals(map1);
        System.out.println(isHashMapsSame);
    }

}

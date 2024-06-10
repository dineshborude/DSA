package collections;

import java.util.Arrays;

public class DuplicatesInArrays {

    public static void main(String[] args) {

        int[] num1 = {1,2,4,5,6,1,2};
        int length = num1.length;

        for (int i = 0; i < length; i++) {

            for (int j = i+1; j < length; j++) {
                if (num1[i] == num1[j]) {

                    System.out.println(num1[i]);
                    break;

                }
            }

        }


    }

}

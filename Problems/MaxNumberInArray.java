import java.util.Arrays;

public class MaxNumberInArray {

    public static void main(String[] args) {
        int[] num = {13,4,7,18,9,2};
        System.out.println(Arrays.toString(num));
        int length = num.length;
        System.out.println("Length Of Given Array : "+length);
        int max = 0;

        for (int i = 0; i < length; i++) {
            max = num[i];
            for (int j = 0; j < length; j++) {

                if (max <= num[j]) {
                    max = num[j];
                }

            }

        }
        System.out.println("Maximum In Array : "+max);
    }




}

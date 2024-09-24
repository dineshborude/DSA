import java.util.Arrays;

public class MaxNumberInArray {

    public static void main(String[] args) {
        int[] num = {23,4,7,180,9,90};
        System.out.println(Arrays.toString(num));
        int length = num.length;
        System.out.println("Length Of Given Array : "+length);
        int max = 0;

        for (int i = 0; i < length; i++) {

            if (num[i] >= max) {
                max = num[i];
            }
        }
        int secondMax = 0;
        for (int j = 0; j < length; j++)
        {
            if(num[j] < max && num[j] > secondMax) {
                secondMax = num[j];
            }
        }

        System.out.println("Maximum In Array : "+max);
        System.out.println("Second Maximum In Array : "+secondMax);

    }




}

package collections;

public class SecondLargestNumber {

    public static void main(String[] args) {

      int[] numbers = {4,11,13,17};

      int max = 0;
      int secondMax = 0;

      for (int i = 0; i < numbers.length; i++) {

          if (numbers[i] > max) {
              max = numbers[i];
          }

      }
      System.out.println(max);

      for (int j = 0; j < numbers.length; j++) {

          if (numbers[j] > secondMax && numbers[j] < max) {
              secondMax = numbers[j];
          }


      }
        System.out.println(secondMax);
    }





}

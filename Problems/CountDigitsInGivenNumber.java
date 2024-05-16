import java.util.Scanner;
public class CountDigitsInGivenNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Desired Number : ");

        int num = sc.nextInt();

        System.out.println("Number : " +num);

        System.out.println("Total Digits In Number Are : " +countDigit(num));


    }

    public static int countDigit(int num) {
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }


}


import java.util.Scanner;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Desired Number : ");

        int num = sc.nextInt();

        int reversedNumber = reverseMath(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number : " + reversedNumber);
    }

    public static String reverse(int number) {
        String reversedNumber = "";
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            reversedNumber += lastDigit;
        }
        return reversedNumber;
    }

    public static int reverseMath(int number) {
        int reversedNumber = 0;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number%10;
            reversedNumber = (reversedNumber*10)+lastDigit;
            number=number/10;
        }
        return reversedNumber;
    }
}

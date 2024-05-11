import java.util.Scanner;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Desired Number : ");

        int num = sc.nextInt();

        String reversedNumber = reverse(num);
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
}

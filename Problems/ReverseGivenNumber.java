public class ReverseGivenNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number : " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Extract rightmost digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to reversedNumber
            number /= 10; // Remove the rightmost digit
        }
        return reversedNumber;
    }
}

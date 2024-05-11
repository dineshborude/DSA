import java.util.Scanner;

public class CheckPallindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter Number . . .");

        int num = sc.nextInt();
        System.out.println("Your Number : " +num);

        int rev = reverse(num);

        if (num == rev) {
            System.out.println("Pallindrome");
        }else {
            System.out.println("Not Pallindrome");
        }

    }

    public static int reverse(int num) {
        int rev = 0;
        int ld = 0;

        while (num > 0) {
            ld = num % 10;
            rev = (rev*10)+ld;
            num = num/10;
        }

        return rev;
    }

}

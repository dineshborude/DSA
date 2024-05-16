import java.util.Scanner;

public class CheckPallindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter Number . . .");

        int num = sc.nextInt();
        System.out.println("Your Number : " +num);

        System.out.println(isPallindrome(num));

    }

    public static boolean isPallindrome(int num) {
        int rev = 0;
        int ld = 0;
        int dupl = num;

        while (dupl > 0) {
            ld = dupl % 10;
            rev = (rev*10)+ld;
            dupl = dupl /10;
        }

        return (num == rev);
    }

}

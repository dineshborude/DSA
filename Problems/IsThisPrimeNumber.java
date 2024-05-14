import java.util.Scanner;

public class IsThisPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter A Number : ");
        int num = sc.nextInt();
        System.out.println(checkPrime(num));
    }

    public static String checkPrime(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "PRIME";
        }else {
            return "NOT PRIME";
        }
    }

}

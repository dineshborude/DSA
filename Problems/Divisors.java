import java.util.Scanner;

public class Divisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter A Number : ");

        int num = sc.nextInt();

        System.out.println(printAllDivisors(num));

    }

    public static boolean printAllDivisors(int num) {

        for(int i = 1; i <= num; i++) {

            if (num%i == 0) {
                System.out.print(i + " ");
            }

        }

        return false;
    }



}

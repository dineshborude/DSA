import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter Number . . .");

        int num = sc.nextInt();
        System.out.println("Your Number : " +num);



        System.out.println(isArmstrong(num));

    }

    public static boolean isArmstrong(int num) {

        int ld = 0;
        int sum = 0;
        int dupl = num;

        while (dupl > 0) {
            ld = dupl % 10;
            sum += ld*ld*ld;
            dupl = dupl /10;
        }

        return (sum == num);
    }

}

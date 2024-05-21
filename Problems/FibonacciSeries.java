public class FibonacciSeries {

    public static void main(String[] args) {
        int N1 = 0;
        int N2= 1;
        int N3;
        int count = 10;
        System.out.print(N1 +", " +N2);
        for (int i = 2; i < count; i++) {

            N3 = N1 + N2;
            System.out.print(", " +N3);
            N1 = N2;
            N2 = N3;

        }
    }


}

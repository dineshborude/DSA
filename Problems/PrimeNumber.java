public class PrimeNumber {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++ )
        {
            if(i % 1 == 0 && i % i == 0) {
                System.out.println(i + " ");
            }
        }
    }


}

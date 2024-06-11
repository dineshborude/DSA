import java.util.ArrayList;

public class SeparateZerosAndOnesAndCount {

    public static void main(String[] args) {

        String mix = "10011101101";
        int countZero = 0;
        int countOne = 0;
        ArrayList<String> zeros = new ArrayList<>();
        ArrayList<String> ones = new ArrayList<>();

        for (int i = 0; i < mix.length(); i++) {



                if (mix.charAt(i) == '0') {

                    countZero++;
                    zeros.add(String.valueOf(mix.charAt(i)));

                }else {
                    countOne++;
                    ones.add(String.valueOf(mix.charAt(i)));

                }



        }

        System.out.println("Count ZERO : " +countZero);
        System.out.println("Count ONE : " +countOne);
        System.out.println(zeros);
        System.out.println(ones);

    }

}

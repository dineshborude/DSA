package patterns;

public class Triangle_Stars {

    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--) {

            for (int j = 0; j < i+1; j++) {

                System.out.print(" * ");

            }
            System.out.println();
        }

    }

}

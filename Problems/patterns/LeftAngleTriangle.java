package patterns;

public class LeftAngleTriangle {

    public static void main(String[] args) {

        int length = 5;

        for (int i = 0; i <= length; i++) {

            for (int j = 0; j <= length - i; j++) {

                System.out.println(" * ");

            }

        }

    }}


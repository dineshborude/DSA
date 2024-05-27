package patterns;

public class LeftAngleTriangle {

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Print spaces for alignment
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) { // Print stars for the current row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing stars for the current row
        }
    }
}

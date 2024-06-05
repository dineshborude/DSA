public class RemoveNumbersFromString {
    public static void main(String[] args) {

        String s = "sub53od73th";
        int length = s.length();
        String freshString = "";
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < length; i++) {
            boolean isDigit = false;
            for (int j = 0; j < number.length; j++) {
                if (s.charAt(i) == number[j]) {
                    isDigit = true;
                    break;
                }
            }
            if (!isDigit) {
                freshString += s.charAt(i); // Append non-digit characters to freshString
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("String without numbers: " + freshString);
    }
}

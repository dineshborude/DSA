public class RemoveRepeatedCharacters {

    public static void main(String[] args) {

        String str = "Hello Mama";
        String str2 = "";  // Use a String to store the result

        int len = str.length();

        for (int i = 0; i < len; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                str2 += str.charAt(i);  // Concatenation creates new String objects
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("String without repeated characters: " + str2);
    }
}

public class RemoveRepeatedCharacters {

    public static void main(String[] args) {

        String str = "Hello Motto";
        StringBuilder str2 = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {

            boolean isRepeated = false;

            for (int j = 0; j < i; j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    isRepeated = true;
                    break;

                }

            }

            if (!isRepeated) {
                str2.append(str.charAt(i));
            }

        }

        System.out.println("Original String: " + str);
        System.out.println("String without repeated characters: " + str2);
    }
}
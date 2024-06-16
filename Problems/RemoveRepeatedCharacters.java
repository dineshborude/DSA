public class RemoveRepeatedCharacters {

    public static void main(String[] args) {

        String str1 = "Hello Motto";
        StringBuilder str2 = new StringBuilder();

        int length = str1.length();

        for (int i = 0; i < length; i++) {
            boolean repeated = false;
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {

                    repeated = true;
                    break;

                }

            }
        if (!repeated) {
            str2.append(str1.charAt(i));
        }
        }




        System.out.println("Original String: " + str1);
        System.out.println("String without repeated characters: " + str2);
    }
}
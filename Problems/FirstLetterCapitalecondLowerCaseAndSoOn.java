public class FirstLetterCapitalecondLowerCaseAndSoOn {

    public static void main(String[] args) {

       //Change a string such that first character is upper case, second is lower case and so on.

        String sentence = "india is my country";
        StringBuilder newSentense = new StringBuilder();

        int length = sentence.length();

        for (int i = 0; i < length; i++) {

            if (i%2 == 0) {

                newSentense.append(Character.toUpperCase(sentence.charAt(i)));

            }else {
                newSentense.append(Character.toLowerCase(sentence.charAt(i)));
            }

        }

        System.out.println(newSentense);


    }


}

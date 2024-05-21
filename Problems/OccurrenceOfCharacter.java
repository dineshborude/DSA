public class OccurrenceOfCharacter {

    public static void main(String[] args) {

        String given = "LTIMINdtree";
        given = given.toLowerCase().replaceAll(" ","");

        System.out.println(given);
        int length = given.length();
        System.out.println("Length Of Given String : " +length);
        int count = 0;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

                if (given.charAt(i) == given.charAt(j)){
                    count++;
                }

            }
            System.out.println("Count Of "+given.charAt(i) +" is "+count);
            count = 0;
        }



    }

}

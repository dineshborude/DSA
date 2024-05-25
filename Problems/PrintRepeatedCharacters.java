public class PrintRepeatedCharacters
{

    public static void main(String[] args) {


        String str = "Hello Mama Jii";
        System.out.println(str);

        StringBuilder str2= new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            boolean isRepeated = false;
            int count = 0;

            for (int j = 0; j < i; j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    isRepeated = true;
                    count++;
                    System.out.print("Repeated Character : "+str.charAt(j) +" Count : " +count +",");
                    break;

                }

            }

            if (!isRepeated) {

                str2.append(str.charAt(i));

            }
        }

        System.out.println(str2);


    }


}

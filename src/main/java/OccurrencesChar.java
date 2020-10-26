
public class OccurrencesChar {
    public static void main(String[] args) {


        String str ="abdsd3$asda$asasdd$sadas";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) == '$')
                count++;


        }
        System.out.println(count);

    }

}





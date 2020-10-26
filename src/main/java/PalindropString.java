public class PalindropString {

    public static void main(String[] args) {

//Write a program to check if string is palindrop ( example abba )

    String str = "abba",rev ="";
    int length = str.length();
        for (int i = length-1; i >=0 ; i--){
            rev = rev+str.charAt(i);
            if (str.equals(rev))
            System.out.println(str +" is a Palindrome");

        }

    }}



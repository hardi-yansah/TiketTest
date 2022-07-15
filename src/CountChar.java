import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {
        //initialize scanner for input
        try (Scanner scnr = new Scanner(System.in)) {

            //variable
            String userText = scnr.nextLine();
            System.out.println("Please input character: " + userText);  // Output user input
            String input = userText;

            //loop for count each char
            int countLetters = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                
                //exclude space, comma, exclamation mark and question mark
                if ((c != ' ') && (c != ',') && (c != '.') && (c != '!') && (c != '?')) {
                    countLetters++;
                }
            }
            //print the result
            System.out.println("Count of character is: "+ countLetters);
        }
    }
}

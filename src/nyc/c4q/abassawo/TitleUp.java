package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/17/15.
 */

import java.util.Scanner;
public class TitleUp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userTitle;

        System.out.println("Give me a phrase or a title");
        userTitle = userInput.next() + " " + userInput.next();
            prettyText(userTitle, '*');




    }
    public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.toUpperCase().charAt(i);
        }
        return result;
    }

     public static String repeat(char c, int count) {  //re
         String result = "";
            for (int i = 0; i < count; ++i) {
                result += c;
            }
         return result;
     }

    public static void prettyText (String text, char underLineChar) {
        //Break up text string into the strings that make it up
        String underline = repeat(underLineChar, text.length());  //uses earlier repeat method.
        System.out.println("\n" + substring(text, 0, text.length()));  //refers to earlier substring method.
        System.out.println(underline);
    }
}


package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexExample {
 //We compile the pattern. The dot (.) metacharacter stands for any single character in the text.
	
    public static void main(String[] args) {

        List < String > words = Arrays.asList("One", "Two",
            "Three", "Four", "Five", "Six", "Seven", "Maven", "Amen", "eleven");

        Pattern p = Pattern.compile("..even"); //here the code is compile exactly sees the no of characters say if i write .even then seven is true 
        //if i write ..even then eleven is true

        for (String word: words) {

            Matcher m = p.matcher(word);

            if (m.matches()) {
                System.out.printf("%s -> matches%n", word);
            } else {
                System.out.printf("%s -> does not match%n", word);
            }
        }
    }
}
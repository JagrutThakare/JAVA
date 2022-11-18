
import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {
    
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = Pattern.compile(console.readLine("%nEnter your regex: "));

            Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" +
                        " \"%s\" starting at " +
                        "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;
            }
            if (!found) {
                console.format("No match found.%n");
            }
        }
    }
}

/*
 * There are two ways to force a metacharacter to be treated as an ordinary
 * character:
 * 
 * precede the metacharacter with a backslash, or
 * enclose it within \Q (which starts the quote) and \E (which ends it).
 * [abc]+ (a or b or c, one or more times) or (abc)+ (the group "abc", one or more times).
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
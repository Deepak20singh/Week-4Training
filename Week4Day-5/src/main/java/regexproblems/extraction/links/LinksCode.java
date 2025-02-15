package regexproblems.extraction.links;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinksCode {
    public static String[] words(String sentence) {
        String regex2="\\b[a-z]{4,5}://[a-z]{3}.[a-zA-Z]*.[a-z]{2,3}\\b";
        Pattern pattern1=Pattern.compile(regex2);
        Matcher matcher2 = pattern1.matcher(sentence);

        ArrayList<String> emails = new ArrayList<>();
        while (matcher2.find()) {
            emails.add(matcher2.group());
        }

        return emails.toArray(new String[0]);

    }
}

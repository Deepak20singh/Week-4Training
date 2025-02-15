package regexproblems.extraction.dates;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatesCode {
    public static String[] words(String sentence) {
        String regex2="\\b(0[1-9]|[0-9]{2})/(0[1-9]|1[0-2])/([0-9]{4})\\b";
        Pattern pattern1=Pattern.compile(regex2);
        Matcher matcher2 = pattern1.matcher(sentence);

        ArrayList<String> dates = new ArrayList<>();
        while (matcher2.find()) {
            dates.add(matcher2.group());
        }

        return dates.toArray(new String[0]);

    }
}

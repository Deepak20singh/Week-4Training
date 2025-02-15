package regexproblems.extraction.capitalized;

import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedCode {
    public static String[] words(String sentence) {
       // String regex1="\\s";
        String regex2="\\b[A-Z][a-zA-Z]*\\b";
       // Pattern pattern = Pattern.compile(regex1);
        Pattern pattern1=Pattern.compile(regex2);
      //  Matcher matcher = pattern.matcher(sentence);
        Matcher matcher2 = pattern1.matcher(sentence);

        ArrayList<String> words = new ArrayList<>();
        int lastIndex = 0;

      //  while (matcher.find()) {
       //     words.add(sentence.substring(lastIndex, matcher.start()));
      //      lastIndex = matcher.end();
      //  }
       // words.add(sentence.substring(lastIndex));
        ArrayList<String> capitalizedWords = new ArrayList<>();
        while (matcher2.find()) {
            capitalizedWords.add(matcher2.group());
        }

        return capitalizedWords.toArray(new String[0]);

    }
}

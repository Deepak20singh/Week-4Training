package regexproblems.replaceandmodify.replacespace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpaceCode {
    public static String check(String sentence){
        String regex="\\s+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(sentence);
         String result=matcher.replaceAll(" ");;
        return result;
    }
}

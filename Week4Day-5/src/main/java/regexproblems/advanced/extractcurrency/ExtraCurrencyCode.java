package regexproblems.advanced.extractcurrency;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraCurrencyCode {
public static List<String> check(String str){
    String regex="(([0-9]*|\\$[0-9]*)\\.[0-9]{2,3})";
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher= pattern.matcher(str);
    List<String> li=new ArrayList<>();
    while (matcher.find()){
        li.add(matcher.group());
    }
    System.out.println(li);
    return li;
}
}

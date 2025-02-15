package regexproblems.advanced.repeating;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingCode {
    public static List<String> check(String str){
        String ans=str;

        String regex = "\\b(Python|Java|Go|C\\+\\+|C#|JavaScript|TypeScript|Swift|Kotlin|Dart|Ruby|PHP|Rust|Scala|Perl|Objective\\-C|Lua|MATLAB)\\b";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(ans);
        List<String> li=new ArrayList<>();
        while(matcher.find()){
           li.add(matcher.group());

        }
        System.out.println(li);

        return li;

    }
}

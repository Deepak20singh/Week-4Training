package regexproblems.replaceandmodify.censorbad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadCode {
    public static String check(String str){
       String ans=str;
        //List<String> li=new ArrayList<>(Arrays.asList("Damn","Bitch","MotherFucker"));
        //for (String badWord : li) {

            String regex ="(Damn|Bitch|MotherFucker)";
            StringBuilder result=new StringBuilder();
            Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(ans);

       while(matcher.find()){
           String badword= matcher.group();
           String replacement="*".repeat(badword.length());
           matcher.appendReplacement(result,replacement);

       }
       matcher.appendTail(result);

        return result.toString();
        //}



    }
}

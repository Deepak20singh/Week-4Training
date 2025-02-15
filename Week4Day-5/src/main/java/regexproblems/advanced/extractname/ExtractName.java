package regexproblems.advanced.extractname;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractName {
public static ArrayList<String> name(String sentence){
    ArrayList<String> arr=new ArrayList<>();
    String regex="\\b(\\w+)\\b";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(sentence);

    HashMap<String,Integer> result=new HashMap<>();
    while (matcher.find()){
        String word=matcher.group(1).toLowerCase();
        result.put(word,result.getOrDefault(word,0)+1);

    }
    for (Map.Entry<String,Integer> item:result.entrySet()){
        if(item.getValue()>1){
            arr.add(item.getKey());
            result.put(item.getKey(),0);
        }
    }
    System.out.println(arr);
    return arr;


}
}

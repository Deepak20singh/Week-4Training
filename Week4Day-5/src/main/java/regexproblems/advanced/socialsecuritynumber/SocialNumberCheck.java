package regexproblems.advanced.socialsecuritynumber;

public class SocialNumberCheck {
    public static boolean check(String str){
        String regex="^([0-9]{3}-[0-9]{2}-[0-9]{4})$";
        return str.matches(regex);
    }
}

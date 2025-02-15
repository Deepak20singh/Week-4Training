package regexproblems.basic.username;

public class UsernameCode {
    public static boolean check(String name){
        String regex="^[[A-Za-z]+_[0-9]]{5,15}$";
        return name.matches(regex);
    }
}

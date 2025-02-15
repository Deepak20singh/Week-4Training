package regexproblems.advanced.validateip;

public class Validate {
    public static boolean check(String str){
        String regex="^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return str.matches(regex);
    }
}

package regexproblems.advanced.creditcard;

public class CreditCard {
    public static boolean check(String str){
        String regex="^((4[0-9]{14})|(5[0-9]{15}))$";
        return str.matches(regex);
    }
}

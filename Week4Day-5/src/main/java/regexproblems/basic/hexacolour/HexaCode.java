package regexproblems.basic.hexacolour;

public class HexaCode {
    public static boolean check(String name){
        String regex="^#[a-zA-Z][a-zA-Z][a-zA-Z0-9][0-9]{3}";
        return (name.matches(regex));

    }
}

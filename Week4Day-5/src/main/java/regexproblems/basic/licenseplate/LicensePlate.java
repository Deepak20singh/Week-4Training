package regexproblems.basic.licenseplate;

public class LicensePlate {
    public static boolean check(String name){
        String regex="[A-Z][A-Z][0-9]{4}";
        return (name.matches(regex));

        }
}

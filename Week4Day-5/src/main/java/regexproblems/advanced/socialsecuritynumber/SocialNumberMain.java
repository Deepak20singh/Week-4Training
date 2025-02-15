package regexproblems.advanced.socialsecuritynumber;

import java.util.Scanner;
import static regexproblems.advanced.socialsecuritynumber.SocialNumberCheck.check;

public class SocialNumberMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s=sc.nextLine();

        System.out.println(check(s));;
    }
}

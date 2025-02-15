package regexproblems.advanced.validateip;

import java.util.Scanner;

import static regexproblems.advanced.validateip.Validate.check;


public class ValidateIpMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s=sc.nextLine();

        System.out.println(check(s));;

    }

}

package regexproblems.advanced.creditcard;

import java.util.Scanner;

import static regexproblems.advanced.creditcard.CreditCard.check;


public class CreditCardMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s=sc.nextLine();

        System.out.println(check(s));;
    }
}

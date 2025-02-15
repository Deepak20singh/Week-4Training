package regexproblems.advanced.extractcurrency;

import java.util.Scanner;

import static regexproblems.advanced.extractcurrency.ExtraCurrencyCode.check;


public class ExtraCurrencyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s= sc.nextLine();

       check(s);;

    }
}

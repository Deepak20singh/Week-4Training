package regexproblems.advanced.repeating;

import java.util.Scanner;

import static regexproblems.advanced.repeating.RepeatingCode.check;

public class RepeatingMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s= sc.nextLine();

        check(s);

    }
}

package regexproblems.replaceandmodify.replacespace;

import java.util.Scanner;

import static regexproblems.replaceandmodify.replacespace.ReplaceSpaceCode.check;

public class ReplaceSpaceMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s=sc.nextLine();

            System.out.println(check(s));;

    }
}

package regexproblems.replaceandmodify.censorbad;

import java.util.Scanner;

import static regexproblems.replaceandmodify.censorbad.CensorBadCode.check;

public class CensorMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s= sc.nextLine();

        System.out.println(check(s));;

    }
}

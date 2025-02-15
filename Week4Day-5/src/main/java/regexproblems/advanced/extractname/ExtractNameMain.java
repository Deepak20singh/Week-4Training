package regexproblems.advanced.extractname;

import java.util.Scanner;

import static regexproblems.advanced.extractname.ExtractName.name;

public class ExtractNameMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s= sc.nextLine();

        name(s);
    }
}

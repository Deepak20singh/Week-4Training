package regexproblems.basic.hexacolour;

import java.util.Scanner;

import static regexproblems.basic.hexacolour.HexaCode.check;

public class HexaMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s=sc.nextLine();
        System.out.println(check(s)?"Valid":"Not Valid");
    }
}

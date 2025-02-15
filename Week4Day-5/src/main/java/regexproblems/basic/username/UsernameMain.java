package regexproblems.basic.username;

import java.util.Scanner;

import static regexproblems.basic.username.UsernameCode.check;

public class UsernameMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Username :- ");
        String name=sc.nextLine();
        System.out.println();
        System.out.println(check(name));
    }
}

package regexproblems.basic.licenseplate;

import java.util.Scanner;

import static regexproblems.basic.licenseplate.LicensePlate.check;

public class LicensePlateMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s=sc.nextLine();
        System.out.println(check(s)?"Valid":"Not Valid");
    }
}

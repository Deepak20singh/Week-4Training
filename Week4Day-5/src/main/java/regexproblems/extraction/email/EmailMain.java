package regexproblems.extraction.email;

import java.util.Scanner;


import static regexproblems.extraction.email.EmailCode.words;

public class EmailMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s=sc.nextLine();
        String[] arr=words(s);
        for(String word:arr){
            System.out.println(word);;
        }
    }
}

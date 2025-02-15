package regexproblems.extraction.capitalized;

import java.util.Scanner;

import static regexproblems.extraction.capitalized.CapitalizedCode.words;

public class CapitalizedWordMain {
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


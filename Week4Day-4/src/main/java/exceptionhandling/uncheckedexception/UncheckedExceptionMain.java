package exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

import static exceptionhandling.uncheckedexception.UncheckedException.uncheckedExpection;

public class UncheckedExceptionMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter the Number :- ");
            int a=sc.nextInt();
            System.out.print("Enter the Number :- ");
            int b=sc.nextInt();
            uncheckedExpection(a,b);


        }catch (InputMismatchException e){
            System.out.println("Please enter integer");
        }

    }
}

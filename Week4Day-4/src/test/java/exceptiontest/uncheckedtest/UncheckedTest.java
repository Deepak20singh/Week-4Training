package exceptiontest.uncheckedtest;

import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static exceptionhandling.uncheckedexception.UncheckedException.uncheckedExpection;

public class UncheckedTest {
    @Test
    public void Tester(){
        Scanner sc=new Scanner(System.in);
        int ans=0;
        try{
            int a=4;
            int b=2;
            ans=uncheckedExpection(a,b);


        }catch (InputMismatchException e){
            System.out.println("Please enter integer");
        }
        Assert.assertEquals(2,ans);
    }
}

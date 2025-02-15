package exceptiontest.uncheckedtest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
    @Test
    public void tester(){
        int a=4;
        int b=0;//This assertThrows itself acts like a catch method. If we use a try-catch block there, it wouldn't be able to catch the exception.
        ArithmeticException exception= Assert.assertThrows(ArithmeticException.class,()-> uncheckedExpection(a,b));
        Assertions.assertEquals("Divide by zero not allowed", exception.getMessage());
    }

}

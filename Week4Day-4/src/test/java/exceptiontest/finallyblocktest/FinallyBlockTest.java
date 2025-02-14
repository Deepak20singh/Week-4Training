package exceptiontest.finallyblocktest;

import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static exceptionhandling.finallyblock.IntegerDivision.division;

public class FinallyBlockTest {
    @Test
    public void Tesster(){
        int ans=0;
        try{
            int a=4;
            int b=2;
            ans=division(a,b);


        }catch (InputMismatchException e){
            System.out.println("Please enter integer");
        }
        Assert.assertEquals(2,ans);
    }
}

package exceptionhandling.exceptionpropagation;

import static exceptionhandling.exceptionpropagation.Method2Class.method2;

public class ExceptionMain {
    public static void main(String[] args) {
        try{
        method2();
        }catch (ArithmeticException e){
            System.out.println(" Number is divided by 0");
        }
    }
}

package exceptionhandling.uncheckedexception;


public class UncheckedException {
    public static int uncheckedExpection(int a,int b) throws ArithmeticException {
        int ans=0;

               if(b==0)throw new ArithmeticException("Divide by zero not allowed");
               ans=a/b;
               System.out.println(ans);

return ans;
    }
}

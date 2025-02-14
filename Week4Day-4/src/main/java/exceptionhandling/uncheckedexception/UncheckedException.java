package exceptionhandling.uncheckedexception;


public class UncheckedException {
    public static int uncheckedExpection(int a,int b){
        int ans=0;
           try{
               ans=a/b;
               System.out.println(ans);
           }catch(ArithmeticException e){
               System.out.println(e.getMessage());
           }
return ans;
    }
}

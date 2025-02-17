package reflection.basic.invoketest;

import org.junit.Assert;
import org.junit.Test;
import reflection.basic.invokeprivate.Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {
    @Test
    public void Tester() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calculator cal1=new Calculator();
        Class<?> cls1=cal1.getClass();
        Method method= cls1.getDeclaredMethod("calculate",int.class,int.class);
        method.setAccessible(true);

        int ans = (int) method.invoke(cal1,4,5);
        Assert.assertEquals(9,ans);
    }
}

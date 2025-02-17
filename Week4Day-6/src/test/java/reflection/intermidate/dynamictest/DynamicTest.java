package reflection.intermidate.dynamictest;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicTest {
    @Test
    public void Tester() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String path = "reflection.intermidate.dynamic.MathOperations";
        int a=3;
        int b=2;

        Class<?> classObj=Class.forName(path);
        Object obj=classObj.getDeclaredConstructor().newInstance();
                Method method1=classObj.getDeclaredMethod("add",int.class,int.class);
                int result1=(int) method1.invoke(obj,a,b);
                Method method2=classObj.getDeclaredMethod("subtract",int.class,int.class);
                int result2=(int) method2.invoke(obj,a,b);
                Method method3=classObj.getDeclaredMethod("multiply",int.class,int.class);
                int result3=(int) method3.invoke(obj,a,b);
        Assert.assertEquals(5,result1);
        Assert.assertEquals(1,result2);
        Assert.assertEquals(6,result3);

    }
    }

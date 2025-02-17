package reflection.basic.classinformationtest;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfoTest {
    @Test
    public void Tester() throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
       String path="reflection.basic.classinformation.InformationClass";
        Class<?> cls1=Class.forName(path);
        Method[] methods=cls1.getDeclaredMethods();

        Constructor<?> constructor=cls1.getConstructor(String.class);
        Field field= cls1.getDeclaredField("name");
        field.setAccessible(true);
        Assert.assertEquals("info",methods[0].getName());
        Assert.assertEquals("infomation",methods[1].getName());

    }
}

package reflection.basic.accessprivatetest;

import org.junit.Assert;
import org.junit.Test;
import reflection.basic.accessprivate.Person;

import java.lang.reflect.Field;

public class AccessTest {
    @Test
    public void Tester() throws NoSuchFieldException, IllegalAccessException {
        Person p1=new Person(5);
        Class<?> cls1=p1.getClass();
        Class<? super Person>cls3=Person.class;

        Field field= cls1.getDeclaredField("age");
        field.setAccessible(true);
        field.set(p1,25);
        Assert.assertEquals(25,field.get(p1));

    }
}

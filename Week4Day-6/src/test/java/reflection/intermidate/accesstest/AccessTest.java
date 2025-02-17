package reflection.intermidate.accesstest;

import org.junit.Assert;
import org.junit.Test;
import reflection.intermidate.access.Configuration;

import java.lang.reflect.Field;

public class AccessTest {
    @Test
    public void Tester(){
        Configuration config=new Configuration();
        Class<?> obj=config.getClass();
        Field field= null;
        try {
            field = config.getClass().getDeclaredField("API_KEY");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        field.setAccessible(true);
        try {
            field.set(obj,"Deepak");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Configuration config1=new Configuration();
        Assert.assertEquals("Deepak",config1.getApiKey());
    }
}

package reflection.intermidate.retrievetest;

import org.junit.Assert;
import org.junit.Test;
import reflection.intermidate.retrieve.Author;
import reflection.intermidate.retrieve.Book;

import java.lang.reflect.Method;

public class RetrieveTest {
    @Test
    public void Tester(){
        Book b1=new Book();
        Class<?> obj=b1.getClass();
        Method[] method = obj.getDeclaredMethods();

        Author obj1=method[0].getAnnotation(Author.class);
        Author obj2=method[1].getAnnotation(Author.class);
        Assert.assertEquals("Dev",obj1.name());
        Assert.assertEquals("Aditya",obj2.name());
    }
}

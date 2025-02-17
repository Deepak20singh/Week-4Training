package reflection.advance.executiontest;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExecutionTest {
    @Test
    public void Tester() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
                Class<?> classDemo = Class.forName("reflection.advance.executiontiming.Person");
                Object obj = classDemo.getDeclaredConstructor().newInstance();

                Method method = classDemo.getDeclaredMethod("show");

                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();

                long executionTime = end - start;
                System.out.println("Execution time: " + executionTime + " nanoseconds");

                assertTrue(executionTime > 0, "Execution time should be greater than 0");
            }
        }


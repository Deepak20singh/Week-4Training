package reflection.advance.injectiontest;

import org.junit.Test;
import reflection.advance.injection.Injectioncode;
import reflection.advance.injection.Service;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InjectionTest {
         @Test
        public void testDependencyInjection() {
           Map<String, Object> dependencies = new HashMap<>();

            Service service = Injectioncode.add(Service.class, dependencies);

            assertNotNull(service, "Service instance should not be null");


             }

}

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        assertEquals(greeting.helloWorld(), "Hello World");
    }

    @Test
    void testHelloWorld() {

    }

    @AfterEach
    void tearDown() {

    }
}
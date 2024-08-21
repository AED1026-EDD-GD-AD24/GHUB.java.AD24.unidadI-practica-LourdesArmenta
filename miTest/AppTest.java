package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test 
    void appHasAGreeting() {
        Principal classUnderTest = new Principal();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
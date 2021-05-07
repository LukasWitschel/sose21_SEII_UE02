package builder;

import org.junit.*;
import org.junit.jupiter.api.Test;

public class TestRegistrationOutcome{

        private Registration reg = null;

        @Before
        public void setUp() throws Exception {
            reg = new Registration();
        }

        @Test
        public void testWithFactory() {
            User dto = UserFactory.createDefaultUserWithNoPassword();
            RegistrationOutcome result = reg.registerUser( dto );

            assertFalse( result.getResult()  );
            assertEquals( result.getReason() , RegistrationOutcome.PASSWORD_MISSING );
        }

        @Test
        public void testEasy() {
            RegistrationOutcome result = reg.registerUser(new User());
            assertNotNull( result );
        }
}

package builder;

import org.junit.jupiter.api.Test;
import org.junit.*;

public class TestRegistration {

        private Registration reg = null;

        @Before
        public void setUp() throws Exception {
            reg = new Registration();
        }
        @Test
        public void test1(){
            User = UserFactory.createDefaultUserWithNoPassword();
            RegistrationOutcome reg1 = this.reg.registerUser(dto);

            assertEquals(reg1.getResult() , false );
        }
        @Test2
        public void test2(){
            RegistrationOutcome reg2 = this.reg.registerUser( new User() );
            assertNotNull(reg2);
        }

        @Test3
        public void test3() {
            User dto = null;
            dto = UserBuilder.getInstance().createDefaultUser().but().withNoPassword().done();
            dto = UserBuilder.getInstance().createDefaultUser().withAddress("Bonn").and().withNoPassword().thatsall();
        }
}

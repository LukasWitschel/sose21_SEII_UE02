package builder;

public class UserBuilder {
        public static UserBuilder build = null;

        private User userDTO = null;

        public UserBuilder() {
        }

        public UserBuilder createNewUser() {
            userDTO = new User();
            return build;
        }

        public static UserBuilder getInstance() {
            build =  new UserBuilder();
            return build;
        }

        public UserBuilder withNoPassword() {
            this.userDTO.setPassword("");
            return build;
        }

        public UserBuilder withNoAddress() {
            this.userDTO.setAddress("");
            return build;
        }

        public User done() {
            return this.userDTO;
        }

        public User thatsall() {
            return this.userDTO;
        }

        public UserBuilder withUserName( String name) {
            this.userDTO.setName(name);;
            return build;
        }

        public UserBuilder withUserID( String id ) {
            this.userDTO.setUserID(id);
            return build;
        }

        public UserBuilder withPassword( String password ) {
            this.userDTO.setPassword(password);
            return build;
        }

        public UserBuilder withAddress( String address ) {
            this.userDTO.setAddress( address );
            return build;
        }

        public UserBuilder withGebDatum( String gebDatum ) {
            this.userDTO.setGebDatum(gebDatum);
            return build;
        }

        public UserBuilder and() {
            return build;
        }

        public UserBuilder but() {
            return build;
        }

        public UserBuilder createDefaultUser() {
            userDTO = new User();
            this.userDTO.setGebDatum("21.8.1979");
            this.userDTO.setName("Alexander Mayer");
            this.userDTO.setPassword("abc99");
            this.userDTO.setUserID("alex");
            this.userDTO.setAddress("Heimweg 22, 53111 Bonn");
            return build;
        }
}

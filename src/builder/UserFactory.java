package builder;
public class UserFactory {

    public static User createDefaultUserWithNoPassword() {
        User dto = UserFactory.getDefaultUser();
        dto.setPassword("");
        return dto;
    }

    public static User createNewUserWithNameAndPassword( String name, String password ) {
        User dto = new User();
        dto.setName(name);
        dto.setPassword(password);
        return dto;
    }

    public static User createDefaultUserWithNoPasswordAndNoAddress() {
        User dto = UserFactory.getDefaultUser();
        dto.setPassword("");
        dto.setAddress("");
        return dto;
    }

    private static User getDefaultUser() {
        User dto = new User();
        dto.setName("Christian Dödl");
        dto.setPassword("pass1234");
        dto.setAddress("Bonn");
        dto.setGebDatum("01.01.2001");
        dto.setUserID("cd1");
        return dto;
    }

}

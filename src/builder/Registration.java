package builder;

public class Registration {
    public RegistrationOutcome registerUser(User dto) {
        RegistrationOutcome result = new RegistrationOutcome();
        if ( dto.getPassword() == null || dto.getPassword().equals("")) {
            result.setReason(RegistrationOutcome.PASSWORD_MISSING);
            result.setResult(false);
        }
        else {
            result.setReason(RegistrationOutcome.REGISTRATION_SUCCESSFULL);
            result.setResult(true);
        }
        return result;
    }
}

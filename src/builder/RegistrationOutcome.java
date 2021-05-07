package builder;

public class RegistrationOutcome {

        public final static String PASSWORD_MISSING = "passwordmissing";
        public final static String REGISTRATION_SUCCESSFULL = "successfull";

        private boolean result;

        private String reason;

        public boolean getResult() {
            return result;
        }

        public void setResult(boolean result) {
            this.result = result;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

}

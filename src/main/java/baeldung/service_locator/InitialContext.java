package baeldung.service_locator;

public class InitialContext {
    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailService")) {
            return new EmailService();
        } else if (serviceName.equalsIgnoreCase("SmsService")) {
            return new SmsService();
        }

        return null;
    }
}

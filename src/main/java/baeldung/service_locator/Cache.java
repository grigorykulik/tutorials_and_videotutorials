package baeldung.service_locator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<MessagingService> services = new ArrayList<>();

    public MessagingService getService(String serviceName) {
        for (MessagingService ms : services) {
            if (ms.getServiceName().equalsIgnoreCase(serviceName)) {
                return ms;
            }
        }

        return null;
    }

    public void addService(MessagingService ms) {
        boolean exists = false;

        for (MessagingService s : services) {
            if (s.getServiceName().equalsIgnoreCase(ms.getServiceName())) {
                exists = true;
            }
        }

        if (!exists) {
            services.add(ms);
        }
    }
}

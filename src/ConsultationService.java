public class ConsultationService extends Service
        implements Billable {

    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("Service " + getServiceName() + " is inactive. Cannot perform.");
            return;
        }
        System.out.println("Connecting to an online consultant on " + getServiceName());
    }

    @Override
    public void generateBill() {
        System.out.println("Billing $50.00 for Consultation.");
    }
}
public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    private boolean isPremium;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("Service " + getServiceName() + " is inactive. Cannot perform.");
            return;
        }
        if (isPremium) {
            System.out.println("Accessing Unlimited Cloud Storage on " + getServiceName());
        } else {
            System.out.println("Accessing Standard Cloud Storage (5GB) on " + getServiceName());
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println(getServiceName() + " is now upgraded to Premium.");
    }

    @Override
    public void generateBill() {
        if (isPremium) {
            System.out.println("Billing $19.99 for Premium Cloud Storage.");
        } else {
            System.out.println("Billing $4.99 for Standard Cloud Storage.");
        }
    }
}
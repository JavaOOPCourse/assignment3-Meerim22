public class StreamingService extends Service
        implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String serviceName, int serviceId) {
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
            System.out.println("Streaming 4K content on " + getServiceName());
        } else {
            System.out.println("Streaming Standard content on " + getServiceName());
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println(getServiceName() + " is now upgraded to Premium.");
    }
}
public abstract class Service {

    protected String serviceName;
    protected int serviceId;
    protected boolean isActive;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    public void activateService() {
        this.isActive = true;
        System.out.println(serviceName + " is now ACTIVE.");
    }

    public void deactivateService() {
        this.isActive = false;
        System.out.println(serviceName + " is now INACTIVE.");
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return !isActive;
    }

    public abstract void performService();

}
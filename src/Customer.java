public class Customer extends User {

    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Customer " + name + " cannot manage services.");
    }

    @Override
    public void useService(Service s) {
        System.out.println("Customer " + name + " is using " + s.getServiceName());
        s.performService();
    }
}
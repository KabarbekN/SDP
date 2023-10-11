package decorator;

public class IntrusionDetectionDecorator extends SecurityDecorator{
    public IntrusionDetectionDecorator(SecuritySystem securitySystem) {
        super(securitySystem);
    }

    @Override
    public void activate() {
        super.activate();
        System.out.println("Intrusion detection system activated.");
    }

    @Override
    public void deactivate() {
        super.deactivate();
        System.out.println("Intrusion detection system deactivated.");
    }
}

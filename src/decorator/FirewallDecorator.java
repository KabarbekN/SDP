package decorator;

public class FirewallDecorator extends SecurityDecorator{
    public FirewallDecorator(SecuritySystem securitySystem) {
        super(securitySystem);
    }

    @Override
    public void activate(){
        super.activate();
        System.out.println("FireWall activated");
    }

    @Override
    public void deactivate(){
        super.activate();
        System.out.println("FireWall deactivated");
    }

}

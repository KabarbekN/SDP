package decorator;

public class SecurityDecorator implements SecuritySystem{
    protected SecuritySystem securitySystem;
    public SecurityDecorator(SecuritySystem securitySystem){
        this.securitySystem = securitySystem;
    }
    @Override
    public void activate() {
        securitySystem.activate();
    }

    @Override
    public void deactivate() {
        securitySystem.deactivate();
    }
}

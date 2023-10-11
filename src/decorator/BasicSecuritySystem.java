package decorator;

public class BasicSecuritySystem implements SecuritySystem{
    @Override
    public void activate() {
        System.out.println("Basic Security system activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Basic security system is deactivated");
    }
}

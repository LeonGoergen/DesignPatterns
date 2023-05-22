package structural.bridge.fx;

// Concrete Implementor A
public class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony Turn On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony turn off!");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony set Channel!");
    }
}

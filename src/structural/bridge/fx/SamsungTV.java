package structural.bridge.fx;

// Concrete Implementor B
public class SamsungTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung turn on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung turn off!");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung change Channel!");
    }
}

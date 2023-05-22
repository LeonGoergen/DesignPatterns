package structural.bridge;

import structural.bridge.fx.AdvancedRemoteControl;
import structural.bridge.fx.RemoteControl;
import structural.bridge.fx.SamsungTV;
import structural.bridge.fx.SonyTV;

public class BridgeDemo {
    public static void show () {
        var sonyRemoteControl = new RemoteControl(new SonyTV());
        sonyRemoteControl.turnOff();

        var sonyAdvancedControl = new AdvancedRemoteControl(new SonyTV());
        sonyAdvancedControl.setChannel(5);

        var samsungRemoteControl = new RemoteControl(new SamsungTV());
        samsungRemoteControl.turnOn();

        var samsungAdvancedControl = new AdvancedRemoteControl(new SamsungTV());
        samsungAdvancedControl.setChannel(3);
    }
}

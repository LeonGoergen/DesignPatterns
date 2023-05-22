package structural.facade;

import structural.facade.fx.NotificationService;

// Client
public class FacadeDemo {
    public static void show () {
        var service = new NotificationService();
        service.send("Hello World!", "TargetID");
    }
}

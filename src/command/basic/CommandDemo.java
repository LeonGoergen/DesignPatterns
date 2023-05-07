package command.basic;

import command.basic.customer.*;
import command.basic.fx.Button;
import command.basic.images.BlackAndWhiteCommand;
import command.basic.images.CompositeCommands;
import command.basic.images.ResizeCommand;

public class CommandDemo {
    public static void show () {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommands();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}

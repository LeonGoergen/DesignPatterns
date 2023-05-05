package command;

import command.customer.*;
import command.fx.Button;
import command.images.BlackAndWhiteCommand;
import command.images.CompositeCommands;
import command.images.ResizeCommand;

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

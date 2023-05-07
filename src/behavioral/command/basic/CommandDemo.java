package behavioral.command.basic;

import behavioral.command.basic.customer.*;
import behavioral.command.basic.fx.Button;
import behavioral.command.basic.images.BlackAndWhiteCommand;
import behavioral.command.basic.images.CompositeCommands;
import behavioral.command.basic.images.ResizeCommand;

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

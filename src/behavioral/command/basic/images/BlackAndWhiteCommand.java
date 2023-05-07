package behavioral.command.basic.images;

import behavioral.command.basic.fx.Command;

// Group of Concrete Commands B
public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Apply B&W Filter");
    }
}

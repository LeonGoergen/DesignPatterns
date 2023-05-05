package command.images;

import command.fx.Command;

// Group of Concrete Commands B
public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Apply B&W Filter");
    }
}

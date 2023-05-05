package command.images;

import command.fx.Command;

// Demonstration for Grouped Command A
public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize Image");
    }
}

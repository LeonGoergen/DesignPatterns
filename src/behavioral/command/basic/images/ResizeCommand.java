package behavioral.command.basic.images;

import behavioral.command.basic.fx.Command;

// Demonstration for Grouped Command A
public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize Image");
    }
}

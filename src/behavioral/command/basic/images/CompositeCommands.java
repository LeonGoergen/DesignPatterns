package behavioral.command.basic.images;

import behavioral.command.basic.fx.Command;

import java.util.ArrayList;
import java.util.List;

// Group of Concrete Commands
public class CompositeCommands implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var command : commands)
            command.execute();
    }
}

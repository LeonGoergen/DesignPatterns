package behavioral.command.undo.bold;

import behavioral.command.undo.fx.Command;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() >= 1)
            history.pop().unexecute();
    }
}

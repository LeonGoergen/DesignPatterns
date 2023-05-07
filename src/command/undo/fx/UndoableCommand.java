package command.undo.fx;

import command.undo.fx.Command;

public interface UndoableCommand extends Command {
    void unexecute();
}

package behavioral.command.undo.fx;

public interface UndoableCommand extends Command {
    void unexecute();
}

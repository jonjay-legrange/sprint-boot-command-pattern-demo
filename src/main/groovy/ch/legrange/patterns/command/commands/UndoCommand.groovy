package ch.legrange.patterns.command.commands

class UndoCommand extends Command {
    private static final String KEY = "UndoCommand"
    private String undoneCommand

    @Override
    protected boolean execute() {
        undoneCommand = editor.undo()?.description
        return false
    }

    @Override
    protected String getDescription() {
        return KEY + ' - undo: ' + undoneCommand
    }
}

package ch.legrange.patterns.command.commands

class CutCommand extends Command {
    private static final String KEY = "CutCommand"
    private String cutContent

    @Override
    protected boolean execute() {
        saveBackup()
        cutContent = backup
        editor.content = backup
        editor.content = null
        return true
    }

    @Override
    protected String getDescription() {
        return KEY + ' - cut: ' + cutContent
    }
}

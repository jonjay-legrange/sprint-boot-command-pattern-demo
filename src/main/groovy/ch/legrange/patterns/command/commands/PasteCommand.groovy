package ch.legrange.patterns.command.commands

class PasteCommand extends Command {
    private static final String KEY = "PasteCommand"
    private String pastedContent

    @Override
    protected boolean execute() {
        saveBackup()
        pastedContent = editor.clipboard
        editor.content = pastedContent
        return true
    }

    @Override
    protected String getDescription() {
        return KEY + ' - pasted: ' + pastedContent
    }
}

package ch.legrange.patterns.command.commands

class CopyCommand extends Command {
    private static final String KEY = "CopyCommand"
    private String copiedContent

    @Override
    protected boolean execute() {
        copiedContent = editor.content
        editor.clipboard = copiedContent
        return false
    }

    @Override
    protected String getDescription() {
        return KEY + ' - copied: ' + copiedContent
    }
}

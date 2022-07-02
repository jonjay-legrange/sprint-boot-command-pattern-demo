package ch.legrange.patterns.command.commands

class SetContentCommand extends Command {
    private static final String KEY = "SetContentCommand"
    private String content

    String getContent() {
        return content
    }

    void setContent(String content) {
        this.content = content
    }

    @Override
    protected boolean execute() {
        super.setContent(this.content)
    }

    @Override
    protected String getDescription() {
        return KEY + ' - set content: ' + getContent()
    }
}

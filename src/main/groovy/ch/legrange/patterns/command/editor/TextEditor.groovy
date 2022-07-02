package ch.legrange.patterns.command.editor

import ch.legrange.patterns.command.commands.Command
import ch.legrange.patterns.command.commands.CommandHistory;
import org.springframework.stereotype.Component

@Component
class TextEditor {

    private CommandHistory history = new CommandHistory()

    private String content
    private String clipboard

    CommandHistory getHistory() {
        return this.history
    }

    String getContent() {
        return this.content
    }

    void setContent(String content) {
        this.content = content
    }

    String getClipboard() {
        return this.clipboard
    }

    void setClipboard(String clipboard) {
        this.clipboard = clipboard
    }

    Command undo() {
        if (history.isEmpty()) return

        Command command = history.pop()

        if (command != null) {
            command.undo()
        }

        return command
    }
}

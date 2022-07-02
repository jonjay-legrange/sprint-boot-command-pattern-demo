package ch.legrange.patterns.command.commands

import ch.legrange.patterns.command.editor.TextEditor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
abstract class Command {

    @Autowired
    protected TextEditor editor

    protected abstract boolean execute()
    protected abstract String getDescription()

    protected String backup

    protected void saveBackup() {
        backup = editor.content
    }

    protected void setContent(String content) {
        editor.content = content
    }

    void undo() {
        editor.content = backup
    }
}

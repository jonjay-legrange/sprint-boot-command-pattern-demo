package ch.legrange.patterns.command.service

import ch.legrange.patterns.command.commands.Command
import ch.legrange.patterns.command.editor.TextEditor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ApplicationService {

    @Autowired
    TextEditor editor

    void executeCommand(Command command) {
        editor.history?.push(command)
    }

    String getHistory() {
        return editor.history?.toString()
    }
}

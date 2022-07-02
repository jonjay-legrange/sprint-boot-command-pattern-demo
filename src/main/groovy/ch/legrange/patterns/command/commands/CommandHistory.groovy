package ch.legrange.patterns.command.commands

import java.util.stream.IntStream

class CommandHistory {

    private Deque<Command> history = new ArrayDeque<>()

    void push(Command command) {
        this.history.push(command)
    }

    Command pop() {
        return history.pop()
    }

    Command peek() {
        return history.peek()
    }

    boolean isEmpty() {
        return this.history.isEmpty()
    }

    String toString() {
        int idx = 0
        StringBuilder sb = new StringBuilder()

        for (Command command : history) {
            sb.append('Index ' + idx++ + ': ' + command.description)

            if (history.peekLast() != command) sb.append('<br>')
        }

        return sb.toString()
    }
}

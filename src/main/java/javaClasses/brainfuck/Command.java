package javaClasses.brainfuck;

import java.util.Deque;

public interface Command {

    void execute(Memory memory, Deque loop);

    Command next();

    boolean hasNext();
}

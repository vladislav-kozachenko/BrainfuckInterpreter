package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;

import java.util.Deque;

public class MoveRight extends Command {
    @Override
    void execute(Memory memory, Deque loop) {
        memory.next();
    }
}

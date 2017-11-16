package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;

import java.util.Deque;

public class Decrement extends Command {
    @Override
    void execute(Memory memory, Deque loop) {
        memory.decreaseCurrentCell();
    }
}

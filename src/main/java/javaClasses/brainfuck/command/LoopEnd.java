package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;

import java.util.Deque;

public class LoopEnd extends Command{
    @Override
    void execute(Memory memory, Deque loop) {
        loop.pop();
    }

    @Override
    boolean hasNext() {
        return super.hasNext();
    }

    @Override
    Command next() {
        return super.next();
    }
}

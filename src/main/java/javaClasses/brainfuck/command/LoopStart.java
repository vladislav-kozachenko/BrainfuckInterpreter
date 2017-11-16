package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;

import java.util.Deque;

public class LoopStart extends Command {
    @Override
    void execute(Memory memory, Deque loop) {
        loop.push(this);
    }
}

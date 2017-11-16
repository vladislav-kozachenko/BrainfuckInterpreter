package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;

import java.util.Deque;

public class Increment extends Command{

    @Override
    public void execute(Memory memory, Deque loop) {
        memory.increaseCurrentCell();
    }
}

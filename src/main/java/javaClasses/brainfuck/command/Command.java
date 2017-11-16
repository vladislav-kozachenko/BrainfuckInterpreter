package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;

import java.util.Deque;

public abstract class Command {

    private Command nextCommand;

    public void setNextCommand(Command nextCommand) {
        this.nextCommand = nextCommand;
    }

    public Command getNextCommand() {
        return nextCommand;
    }

    abstract void execute(Memory memory, Deque loop);

    Command next(){
        return nextCommand;
    }

    boolean hasNext(){
        return nextCommand != null;
    }
}

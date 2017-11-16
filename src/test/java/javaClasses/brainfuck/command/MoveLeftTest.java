package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;
import org.junit.Assert;
import org.junit.Test;

public class MoveLeftTest {
    @Test
    public void testExecution(){
        Memory memory = new Memory();
        memory.next();
        new MoveLeft().execute(memory, null);
        Assert.assertEquals(memory.getPointerPosition(), 0);
    }

}

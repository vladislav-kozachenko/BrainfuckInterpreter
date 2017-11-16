package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;
import org.junit.Assert;
import org.junit.Test;

public class MoveRightTest {
    @Test
    public void testExecution(){
        Memory memory = new Memory();
        new MoveRight().execute(memory, null);
        Assert.assertEquals(memory.getPointerPosition(), 1);
    }

}

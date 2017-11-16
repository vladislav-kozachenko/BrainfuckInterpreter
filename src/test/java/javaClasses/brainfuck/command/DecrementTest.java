package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;
import org.junit.Assert;
import org.junit.Test;

public class DecrementTest {

    @Test
    public void testExecution(){
        Memory memory = new Memory();
        new Increment().execute(memory, null);
        new Decrement().execute(memory, null);
        Assert.assertEquals(memory.getCurrentCellValue(), 0);
    }
}

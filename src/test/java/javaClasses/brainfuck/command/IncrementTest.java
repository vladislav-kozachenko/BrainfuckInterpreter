package javaClasses.brainfuck.command;

import javaClasses.brainfuck.Memory;
import org.junit.Assert;
import org.junit.Test;

public class IncrementTest {

    @Test
    public void testExecution(){
        Memory memory = new Memory();
        new Increment().execute(memory, null);
        Assert.assertEquals(memory.getCurrentCellValue(), 1);
    }
}

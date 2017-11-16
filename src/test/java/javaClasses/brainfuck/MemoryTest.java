package javaClasses.brainfuck;

import javaClasses.brainfuck.Memory;
import org.junit.Test;
import org.junit.Assert;

public class MemoryTest {

    @Test
    public void incrementTest(){
        Memory memory = new Memory();
        Assert.assertEquals("Wrong cell value after initialization.",0, memory.getCurrentCellValue());
        memory.increaseCurrentCell();
        Assert.assertEquals("Increment works incorrectly.", 1, memory.getCurrentCellValue());
    }

    @Test
    public void pointerPositionTest(){
        Memory memory = new Memory();
        Assert.assertEquals("Wrong pointer position after initialization.", 0, memory.getPointerPosition());
        memory.next();
        memory.next();
        Assert.assertEquals("Pointer increment works incorrectly", 2, memory.getPointerPosition());
        memory.previous();
        Assert.assertEquals("Pointer decrement works incorrectly", 1, memory.getPointerPosition());
    }

    @Test
    public void decrementTest(){
        Memory memory = new Memory();
        memory.increaseCurrentCell();
        memory.increaseCurrentCell();
        memory.decreaseCurrentCell();
        Assert.assertEquals("Decrement works incorrectly", 1, memory.getCurrentCellValue());
        memory.decreaseCurrentCell();
        Assert.assertEquals("Decrement works incorrectly", 0, memory.getCurrentCellValue());
    }

    @Test
    public void sizeTest(){
        Memory memory = new Memory(100);
        Assert.assertEquals("Unable to get memory size", 100, memory.size());
    }

    @Test
    public void hasNextTest(){
        Memory memory = new Memory(2);
        Assert.assertTrue("Unable to check ability to increase pointer", memory.hasNext());
        memory.next();
        Assert.assertFalse("Unable to check ability to increase pointer", memory.hasNext());
    }

    @Test
    public void hasPreviousTest(){
        Memory memory = new Memory();
        Assert.assertFalse("Unable to check ability to decrease pointer", memory.hasPrevious());
        memory.next();
        Assert.assertTrue("Unable to check ability to decrease pointer", memory.hasPrevious());
    }
}

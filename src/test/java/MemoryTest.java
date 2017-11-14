import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MemoryTest {

    @Test
    public void incrementTest(){
        Memory memory = new Memory();
        Assert.assertEquals(0, memory.getCurrentCellValue());
        memory.increaseCurrentCell();
        Assert.assertEquals(1, memory.getCurrentCellValue());
    }

    @Test
    public void pointerPositionTest(){
        Memory memory = new Memory();
        Assert.assertEquals(0, memory.getPointerPosition());
        memory.next();
        memory.next();
        Assert.assertEquals(2, memory.getPointerPosition());
        memory.previous();
        Assert.assertEquals(1, memory.getPointerPosition());
    }

    @Test
    public void decrementTest(){
        Memory memory = new Memory();
        memory.increaseCurrentCell();
        memory.increaseCurrentCell();
        memory.decreaseCurrentCell();
        Assert.assertEquals(1, memory.getCurrentCellValue());
        memory.decreaseCurrentCell();
        Assert.assertEquals(0, memory.getCurrentCellValue());
    }

    @Test
    public void sizeTest(){
        Memory memory = new Memory(100);
        Assert.assertEquals(100, memory.size());
    }

    @Test
    public void hasNextTest(){
        Memory memory = new Memory(2);
        memory.next();
        Assert.assertTrue(memory.hasNext());
        memory.next();
        Assert.assertFalse(memory.hasNext());
    }

    @Test
    public void hasPreviousTest(){
        Memory memory = new Memory();
        Assert.assertFalse(memory.hasPrevious());
        memory.next();
        Assert.assertTrue(memory.hasPrevious());
    }
}

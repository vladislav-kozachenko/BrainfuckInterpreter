package javaClasses.brainfuck;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ParserTest {

    @Test
    public void parseTest(){
        Parser parser = new Parser();
        ArrayList<Operation> operations = parser.parse("-+<>[].");
        Assert.assertEquals("Wrong parsing of decrement", Operation.DECREMENT, operations.get(0));
        Assert.assertEquals("Wrong parsing of increment", Operation.INCREMENT, operations.get(1));
        Assert.assertEquals("Wrong parsing of pointer decrement", Operation.MOVE_LEFT, operations.get(2));
        Assert.assertEquals("Wrong parsing of pointer increment", Operation.MOVE_RIGHT, operations.get(3));
        Assert.assertEquals("Wrong parsing of loop start", Operation.LOOP_START, operations.get(4));
        Assert.assertEquals("Wrong parsing of loop end", Operation.LOOP_END, operations.get(5));
        Assert.assertEquals("Wrong parsing of output command", Operation.OUTPUT, operations.get(6));
    }
}

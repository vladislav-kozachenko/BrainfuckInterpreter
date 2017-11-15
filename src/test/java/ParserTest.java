import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ParserTest {

    @Test
    public void parseTest(){
        Parser parser = new Parser();
        ArrayList<Command> commands = parser.parse("-+<>[].");
        Assert.assertEquals("Wrong parsing of decrement", Command.DECREMENT, commands.get(0));
        Assert.assertEquals("Wrong parsing of increment", Command.INCREMENT, commands.get(1));
        Assert.assertEquals("Wrong parsing of pointer decrement", Command.MOVE_LEFT, commands.get(2));
        Assert.assertEquals("Wrong parsing of pointer increment", Command.MOVE_RIGHT, commands.get(3));
        Assert.assertEquals("Wrong parsing of loop start", Command.LOOP_START, commands.get(4));
        Assert.assertEquals("Wrong parsing of loop end", Command.LOOP_END, commands.get(5));
        Assert.assertEquals("Wrong parsing of output command", Command.OUTPUT, commands.get(6));
    }
}

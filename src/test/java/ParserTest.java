import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ParserTest {

    @Test
    public void parseTest(){
        Parser parser = new Parser();
        ArrayList<Command> commands = parser.parse("-+<>[].");
        Assert.assertEquals(Command.DECREMENT, commands.get(0));
        Assert.assertEquals(Command.INCREMENT, commands.get(1));
        Assert.assertEquals(Command.MOVE_LEFT, commands.get(2));
        Assert.assertEquals(Command.MOVE_RIGHT, commands.get(3));
        Assert.assertEquals(Command.LOOP_START, commands.get(4));
        Assert.assertEquals(Command.LOOP_END, commands.get(5));
        Assert.assertEquals(Command.OUTPUT, commands.get(6));
    }
}

import org.junit.Assert;
import org.junit.Test;

public class InterpreterTest {

    @Test
    public void executionTest(){
        String sourceCode = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        Interpreter interpreter = new Interpreter();
        Assert.assertEquals("Hello World!\n", interpreter.execute(sourceCode));
    }
}

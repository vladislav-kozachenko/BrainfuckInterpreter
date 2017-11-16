package javaClasses.brainfuck;

import javaClasses.brainfuck.Interpreter;
import org.junit.Assert;
import org.junit.Test;

public class InterpreterTest {

    @Test
    public void executionTest(){
        String sourceCode = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        Interpreter interpreter = new Interpreter();
        Assert.assertEquals("The result of execution is not equals to expected one.", "Hello World!\n", interpreter.execute(sourceCode));
    }
}

package javaClasses.brainfuck;

import java.util.ArrayList;
import com.google.common.base.Strings;

/**
 * Parses input and returns array of commands.
 */
public class Parser {

    public ArrayList<Operation> parse(String sourceCode){
        ArrayList<Operation> operations = new ArrayList<>();
        if (Strings.isNullOrEmpty(sourceCode)){
            throw new RuntimeException();
        }
        for (char command : sourceCode.toCharArray()) {
            for (Operation operation : Operation.values()) {
                if (operation.getSymbol() == command){
                    operations.add(operation);
                }
            }
        }
        return operations;
    }
}

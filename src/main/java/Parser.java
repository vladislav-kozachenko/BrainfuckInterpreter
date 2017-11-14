import java.util.ArrayList;
import com.google.common.base.Strings;

/**
 * Parses input and returns array of commands.
 */
public class Parser {

    public ArrayList<Command> parse(String sourceCode){
        ArrayList<Command> commands = new ArrayList<>();
        if (Strings.isNullOrEmpty(sourceCode)){
            throw new RuntimeException();
        }
        for (char command : sourceCode.toCharArray()) {
            switch (command){
                case '+':
                    commands.add(Command.INCREMENT);
                    break;
                case '-':
                    commands.add(Command.DECREMENT);
                    break;
                case '<':
                    commands.add(Command.MOVE_LEFT);
                    break;
                case '>':
                    commands.add(Command.MOVE_RIGHT);
                    break;
                case '[':
                    commands.add(Command.LOOP_START);
                    break;
                case ']':
                    commands.add(Command.LOOP_END);
                    break;
                case '.':
                    commands.add(Command.OUTPUT);
                    break;
            }
        }
        return commands;
    }
}

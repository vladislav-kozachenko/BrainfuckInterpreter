package javaClasses.brainfuck;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * Launches application on Brainfuck.
 */
public class Interpreter {

    /**
     * Execute program.
     * @param input is the String with source code on BrainFuck
     * @return String with the program output
     */
    public String execute(String input){
        Memory memory = new Memory();
        ArrayList<Operation> operations = new Parser().parse(input);
        StringBuilder output = new StringBuilder();
        Deque<Integer> loopStart = new ArrayDeque<>();
        for(int index = 0; index < operations.size(); index++){
            switch (operations.get(index)){
                case OUTPUT:
                    output.append(memory.getCurrentCellValue());
                    break;
                case INCREMENT:
                    memory.increaseCurrentCell();
                    break;
                case DECREMENT:
                    memory.decreaseCurrentCell();
                    break;
                case MOVE_RIGHT:
                    memory.next();
                    break;
                case MOVE_LEFT:
                    memory.previous();
                    break;
                case LOOP_START:
                    if(memory.getCurrentCellValue() != 0) {
                        loopStart.push(index);
                    }
                    break;
                case LOOP_END:
                    if(memory.getCurrentCellValue() == 0){
                        loopStart.pop();
                    } else {
                        if (!loopStart.isEmpty()) {
                            index = loopStart.peek();
                        }
                    }
                    break;
            }
        }
        return output.toString();
    }

}

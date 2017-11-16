package javaClasses.brainfuck;

public enum Operation {

    INCREMENT('+', "Increment"),
    DECREMENT('-', "Decrement"),
    MOVE_LEFT('<', "MoveLeft"),
    MOVE_RIGHT('>', "MoveRight"),
    OUTPUT('.', "Output"),
    LOOP_START('[', "LoopStart"),
    LOOP_END(']', "LoopEnd");

    private final char symbol;
    private final String commandName;

    Operation(char symbol, String commandName){
        this.symbol = symbol;
        this.commandName = commandName;
    }

    public char getSymbol() {
        return symbol;
    }

}

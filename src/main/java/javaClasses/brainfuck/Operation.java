package javaClasses.brainfuck;

public enum Operation {

    INCREMENT('+'),
    DECREMENT('-'),
    MOVE_LEFT('<'),
    MOVE_RIGHT('>'),
    OUTPUT('.'),
    LOOP_START('['),
    LOOP_END(']');

    private final char symbol;

    Operation(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

}

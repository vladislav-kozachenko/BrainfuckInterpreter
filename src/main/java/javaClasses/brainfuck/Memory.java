package javaClasses.brainfuck;

/**
 * Contains storage for program executing.
 */
public class Memory {

    private char[] array;
    private int pointer;

    /**
     * Creates default memory array with 1000 cells.
     */
    public Memory(){
        array = new char[1000];
        pointer = 0;
    }

    /**
     * Creates memory array with custom size.
     */
    public Memory(int size){
        array = new char[size];
        pointer = 0;
    }

    /**
     *
     * @return value of current cell
     */
    public char getCurrentCellValue(){
        return array[pointer];
    }

    /**
     *
     * @return current position of pointer
     */
    public int getPointerPosition(){
        return pointer;
    }

    /**
     * Move pointer to next cell
     * @return value of next cell
     */
    public char next(){
        return array[++pointer];
    }

    /**
     * Move pointer to previous cell
     * @return value of previous cell
     */
    public char previous(){
        return array[--pointer];
    }

    /**
     * Check if the pointer can be moved right
     * @return true if the pointer can be moved right, false if pointer points to the last cell
     */
    public boolean hasNext(){
        return pointer+1 < size();
    }

    /**
     * Check if the pointer can be moved left
     * @return true if the pointer can be moved left, false if pointer points to the first cell
     */
    public boolean hasPrevious(){
        return pointer > 0;
    }

    /**
     * Increase value of current cell by one
     */
    public void increaseCurrentCell(){
        array[pointer]++;
    }

    /**
     * Decrease value of current cell by one
     */
    public void decreaseCurrentCell(){
        array[pointer]--;
    }

    /**
     *
     * @return size of memory array
     */
    public int size(){
        return array.length;
    }

}

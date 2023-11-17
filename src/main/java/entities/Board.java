package entities;

public interface Board {

    boolean registerMove(Move move);

    Cell getCell(Cell cell);
}

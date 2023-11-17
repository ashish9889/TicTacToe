package entities;

import java.util.List;

public class BoardImpl implements Board {
    private List<List<Cell>> cells;
    private int dimension;

    @Override
    public boolean registerMove(Move move) {
        if(!isCellValid(move.getCell()))
            throw new IllegalArgumentException("Invalid row/column provided!");
        Cell inputCell = getCell(move.getCell());

        if(!inputCell.isEmpty()){
            throw new IllegalArgumentException("Cell is already filled!");
        }

        inputCell.fill(move.getPlayer());
        return true;
    }

    @Override
    public Cell getCell(Cell cell) {
        if(!isCellValid(cell))
            throw new IllegalArgumentException("Invalid row/column provided!");
        return cells.get(cell.getRowNum()).get(cell.getColumnNum());
    }

    private boolean isCellValid(Cell cell){
        if(cell.getRowNum() < 0 || cell.getRowNum() >= dimension || cell.getColumnNum() < 0 || cell.getColumnNum() >= dimension ){
            return false;
        }
        return true;
    }
}

package entities;

public class Cell {
    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    private int rowNum;

    public int getColumnNum() {
        return columnNum;
    }

    public void setColumnNum(int columnNum) {
        this.columnNum = columnNum;
    }

    private int columnNum;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    private Player player;

    public Cell(int row, int column){
        this.rowNum = row;
        this.columnNum = column;
    }
    public boolean isEmpty(){
        return null == player;
    }

    public void fill(Player player) {
        this.player = player;
    }
}

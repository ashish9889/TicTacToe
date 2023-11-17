package entities;

import controller.InputController;

public class BotPlayer implements Player {
    @Override
    public boolean makeMove(Board board) {
        return false;
    }

    public Cell getInputCell() {
        return null;
    }
}

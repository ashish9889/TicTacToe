package entities;

import controller.InputController;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private PlayerType playerType;
    private UserProfile userProfile;
    private ExperienceLevel experienceLevel;
    private Symbol symbol;
    private Board board;
    @Override
    public boolean makeMove(Board board) {
        return board.registerMove(new Move(InputController.getInstance().getInputCell(), this));
    }

}

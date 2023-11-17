package entities;

import java.util.List;
import java.util.Random;

public class Game {
    private Board board;
    private List<Player> playerList;
    private Player nextMovePlayer;
    private GameStateEnum gameState;

    public Game(Board board, List<Player> players){
        this.board = board;
        this.playerList = players;
        nextMovePlayer = playerList.get(new Random().ints(0, players.size()-1)
                .findFirst()
                .getAsInt());
        gameState = GameStateEnum.NOT_STARTED;
    }

    public boolean play(){
        if(gameState.equals(GameStateEnum.FINISED)){
            throw new IllegalArgumentException("Game is already finished!");
        }
        if(this.gameState.equals(GameStateEnum.NOT_STARTED)){
            this.gameState = GameStateEnum.RUNNING;
        }
        while(!gameState.equals(GameStateEnum.FINISED)){
            nextMovePlayer.makeMove(this.board);
            checkGameStatus();
            nextMovePlayer = playerList.get(getNextPlayerIndex());
        }
        return true;
    }

    private int getNextPlayerIndex() {
        int nextPlayerIndex = playerList.indexOf(nextMovePlayer)+1;
        if(nextPlayerIndex == playerList.size()){
            nextPlayerIndex = 0;
        }
        return nextPlayerIndex;
    }

    private void checkGameStatus() {

    }
}

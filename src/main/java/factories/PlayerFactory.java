package factories;

import entities.BotPlayer;
import entities.HumanPlayer;
import entities.Player;
import entities.PlayerType;

public class PlayerFactory {

    public static Player getPlayer(PlayerType playerType){
        if(PlayerType.HUMAN.name().equals(playerType.name())){
            return new HumanPlayer();
        }else if(PlayerType.HUMAN.name().equals(playerType.name())){
            return new BotPlayer();
        }else{
            throw new IllegalArgumentException("Invalid player type passed!");
        }
    }
}

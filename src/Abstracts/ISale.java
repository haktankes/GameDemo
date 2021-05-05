package Abstracts;

import Entities.Player;
import Entities.Game;
import Entities.Campaign;

public interface ISale {
	void buy(Player player,Game game);
	void buy2(Player player,Game game,Campaign campaign);

}

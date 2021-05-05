package Concrete;

import Abstracts.ISale;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements ISale {

	@Override
	public void buy(Player player, Game game) {
		System.out.println(player.getFirstName()+" adl� oyuncu "+ game.getGameName()+" adl� oyunu ba�ar�yla sat�n ald�.");
		
	}

	@Override
	public void buy2(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName()+" adl� oyuncu "+ game.getGameName()+" adl� oyunu "+campaign.getCampaignName()+ " kampanyas�yla ba�ar�yla sat�n ald�.");
		
	}

}

package Concrete;

import Abstracts.ISale;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements ISale {

	@Override
	public void buy(Player player, Game game) {
		System.out.println(player.getFirstName()+" adlý oyuncu "+ game.getGameName()+" adlý oyunu baþarýyla satýn aldý.");
		
	}

	@Override
	public void buy2(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName()+" adlý oyuncu "+ game.getGameName()+" adlý oyunu "+campaign.getCampaignName()+ " kampanyasýyla baþarýyla satýn aldý.");
		
	}

}

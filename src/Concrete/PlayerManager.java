package Concrete;

import Abstracts.IPlayer;
import Entities.Player;
import Services.IPlayerCheckServices;

public class PlayerManager implements IPlayer {
	
	public PlayerManager(IPlayerCheckServices playerCheckServices) {
		super();
		this.playerCheckServices = playerCheckServices;
	}

	private IPlayerCheckServices playerCheckServices;
	
	
	
	
	

	@Override
	public void add(Player player) throws Exception {
		if(playerCheckServices.realPlayer(player)) {
			System.out.println("Yeni oyuncu eklendi : "+player.getFirstName());
			
			
		}else {
			System.out.println("Kay�t ba�ar�s�z");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu sistemden silindi : "+player.getFirstName());
		
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu g�ncelleme ba�ar�l� : "+player.getFirstName());
			
	}

}

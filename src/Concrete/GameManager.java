package Concrete;

import Abstracts.IGame;
import Entities.Game;

public class GameManager implements IGame {
	

	@Override
	public void add(Game game) {
		
		System.out.println("Yeni oyun eklendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun ka�ld�r�ld�: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellemesi ba�ar�l�: " + game.getGameName());
		
	}

}

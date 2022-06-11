package gameProjectKodlamaio.concrete;

import gameProjectKodlamaio.abstracts.GameService;
import gameProjectKodlamaio.entites.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		
		System.out.println("Yeni oyun eklendi : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun sistemden silindi : " + game.getGameName());
	}
		
	
}


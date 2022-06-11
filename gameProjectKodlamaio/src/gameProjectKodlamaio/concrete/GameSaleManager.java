package gameProjectKodlamaio.concrete;

import gameProjectKodlamaio.abstracts.GameSaleService;
import gameProjectKodlamaio.entites.Campaing;
import gameProjectKodlamaio.entites.Game;
import gameProjectKodlamaio.entites.Player;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sale(Player player, Game game, Campaing campaing) {
		System.out.println(player.getFirstName()+" "+ player.getLastName() +" "+ game.getGameName()+ " adlı oyunu satın aldı. İndirim oranı :" +"%"+campaing.getDiscount());
		
	}
	
	

}

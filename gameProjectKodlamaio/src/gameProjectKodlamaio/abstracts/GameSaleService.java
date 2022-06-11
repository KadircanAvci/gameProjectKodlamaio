package gameProjectKodlamaio.abstracts;

import gameProjectKodlamaio.entites.Campaing;
import gameProjectKodlamaio.entites.Game;
import gameProjectKodlamaio.entites.Player;

public interface GameSaleService {

	void sale(Player player, Game game, Campaing campaing);
}

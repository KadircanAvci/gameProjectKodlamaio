package gameProjectKodlamaio.abstracts;

import gameProjectKodlamaio.entites.Player;

public interface PlayerService {
	void add(Player player) throws Exception;
	void update(Player player);
	void delete(Player player);
}

package gameProjectKodlamaio.concrete;

import gameProjectKodlamaio.abstracts.PlayerCheckService;
import gameProjectKodlamaio.entites.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		
		return true;
	}

}

package gameProjectKodlamaio.concrete;

import gameProjectKodlamaio.abstracts.PlayerCheckService;
import gameProjectKodlamaio.abstracts.PlayerService;
import gameProjectKodlamaio.entites.Player;

public class PlayerManager implements PlayerService{

	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void add(Player player) throws Exception {
		
		if(playerCheckService.checkIfRealPerson(player)) {
		
		System.out.println("Oyuncu sisteme kayıt edildi :" +player.getFirstName()+player.getLastName());
		}else {
			System.out.println("Kullanıcı bilgileri hatalı");
		}
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu bilgileri güncellendi :" +player.getFirstName()+player.getLastName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Kayıt silindi :" +player.getFirstName()+player.getLastName());
		
	}

}

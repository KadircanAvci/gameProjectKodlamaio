package gameProjectKodlamaio;

import gameProjectKodlamaio.concrete.CampaingManager;
import gameProjectKodlamaio.concrete.GameManager;
import gameProjectKodlamaio.concrete.GameSaleManager;
import gameProjectKodlamaio.concrete.PlayerCheckManager;
import gameProjectKodlamaio.concrete.PlayerManager;
import gameProjectKodlamaio.entites.Campaing;
import gameProjectKodlamaio.entites.Game;
import gameProjectKodlamaio.entites.Player;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Player player1 = new Player(1,"Kadircan","Avcı",3,1995);
		Player player2 = new Player(2,"Ahmet","Can",2,1990);
		
		Game game1 = new Game(1,"Fifa2021",1000);
		Game game2 = new Game(2,"MortalCombat",500);
		
		Campaing campaing1 = new Campaing(1, "StudentCampaing", 20);
		Campaing campaing2 = new Campaing(2, "NewYearCampaing", 15);
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.add(player1);
		playerManager.add(player2);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.add(campaing1);
		campaingManager.add(campaing2);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sale(player1, game1, campaing1);
		
	}

}

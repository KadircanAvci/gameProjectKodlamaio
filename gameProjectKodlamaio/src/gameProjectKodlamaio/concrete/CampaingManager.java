package gameProjectKodlamaio.concrete;

import gameProjectKodlamaio.abstracts.CampaingService;
import gameProjectKodlamaio.entites.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println("Yeni kampanya eklendi :" + campaing.getCampaingName()+" İndirim oranı :"+"%"+campaing.getDiscount());
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println("Kampanya güncellendi :" + campaing.getCampaingName()+" İndirim oranı :"+"%"+campaing.getDiscount());
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Kampanya kaldırıldı :" + campaing.getCampaingName()+" İndirim oranı :"+"%"+campaing.getDiscount());
		
	}
	
	
}

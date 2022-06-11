package adepter;



import gameProjectKodlamaio.abstracts.PlayerCheckService;
import gameProjectKodlamaio.entites.Player;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdepter implements PlayerCheckService {

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();	
	
	@Override
	public boolean checkIfRealPerson(Player player) throws Exception {
		
		boolean result = kpsPublic.TCKimlikNoDogrula(player.getIdentificationNumber(), player.getFirstName(), player.getLastName(),player.getDateOfBirth());
		
		if (result == true) {
			return true;
		}else {
			return false;
		}
		
	}
}

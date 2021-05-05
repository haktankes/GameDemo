import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Services.PlayerCheckServices;

public class Main {

	public static void main(String[] args) throws Exception {
		Player player1 = new Player("Ömer","Keþ",1998,"45678913245");
		PlayerManager playerManager = new PlayerManager(new PlayerCheckServices());
		
		playerManager.add(player1);
		
		System.out.println("---------------------");
		
		
		Game game1 = new Game(1,"Call of Duty 2",48);
		GameManager gameManager = new GameManager();
		
		gameManager.add(game1);

		
		System.out.println("---------------------");
		
		
		Campaign campaign1 = new Campaign(1,"Günlük Fýrsat",10);
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(campaign1);
		
		System.out.println("---------------------");
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.buy(player1, game1);
		
		System.out.println("---------------------");
		
		
		saleManager.buy2(player1, game1, campaign1);
		
		
		
		
		
		
		

	}

}

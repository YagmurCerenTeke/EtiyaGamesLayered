package etiyaGamesLayered.userInterface;

import java.time.LocalDate;

import etiyaGamesLayered.business.abstracts.ScoreService;
import etiyaGamesLayered.business.concretes.CampaignManager;
import etiyaGamesLayered.business.concretes.ChildScoreManager;
import etiyaGamesLayered.business.concretes.GameManager;
import etiyaGamesLayered.business.concretes.MenScoreManager;
import etiyaGamesLayered.business.concretes.MernisKpsServiceAdapter;
import etiyaGamesLayered.business.concretes.SellingManager;
import etiyaGamesLayered.business.concretes.UserManager;
import etiyaGamesLayered.dataAccess.concretes.CampaignDao;
import etiyaGamesLayered.dataAccess.concretes.GameDao;
import etiyaGamesLayered.dataAccess.concretes.UserDao;
import etiyaGamesLayered.entities.concretes.Campaign;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;



public class Main {

	public static void main(String[] args) {
	
		Gamer gamer1 = new Gamer("Yagmur","Teke",2012,"12345678910", "Female", 100);
		Gamer gamer2 = new Gamer("Emre", "Ay", 1990, "12345678911", "Male", 100);
		Gamer gamer3 = new Gamer("Sevil","Tekin",1997,"12345678912", "Female", 100);
		Gamer gamer4 = new Gamer("Ercan","Teke",2009,"12345678913", "Male", 100);
		Gamer gamer5 = new Gamer("Ayşe","Aydın",1900,"12345678914", "Female", 100);
		
		
		UserManager userManager = new UserManager(new UserDao(), new MernisKpsServiceAdapter());
		userManager.add(gamer1);
		userManager.list();
		userManager.update(gamer2);
		userManager.delete(gamer3);
		
		System.out.println("----------");
		
		Game game1 = new Game(1, "The Sims", 150,100);
		Game game2 = new Game(2, "Call of Duty", 160,100);
		Game game3 = new Game(3, "BioShock", 170,100);
		Game game4 = new Game(4, "Portal", 180,100);
		Game game5 = new Game(5, "The Legend of Zelda", 100,100);

		GameManager gameManager = new GameManager(new GameDao());
		gameManager.add(game1);
		gameManager.list();
		gameManager.update(game2);
		gameManager.delete(game3);
		
		System.out.println("----------");
		
		Campaign campaign1 = new Campaign(1, "1 alana 1 bedava", 0.50);
		Campaign campaign2 = new Campaign(2, "%30 İndirim", 0.30);
		Campaign campaign3 = new Campaign(3, "Black Friday", 0.80);
		
		CampaignManager campaignManager = new CampaignManager(new CampaignDao());
		campaignManager.add(campaign1);
		campaignManager.list();
		campaignManager.update(campaign2);
		campaignManager.delete(campaign3);
		
		System.out.println("----------");
		
		SellingManager sellingManager = new SellingManager();
		sellingManager.selling(gamer5, game5, campaign3);
		sellingManager.selling(gamer5, game5);
		
		
		ScoreService scoreCalculator = null;
		
		if(LocalDate.now().getYear()-gamer1.getBirthYear()<18) {
			scoreCalculator = new ChildScoreManager();
			gamer1.setScore(scoreCalculator.score (gamer1, game5));
			System.out.println(gamer1.getScore());
	}

}}

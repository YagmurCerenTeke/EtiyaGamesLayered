package etiyaGamesLayered.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import etiyaGamesLayered.dataAccess.abstracts.CampaignDaoRepository;
import etiyaGamesLayered.entities.concretes.Campaign;


public class CampaignDao implements CampaignDaoRepository {

	List<Campaign> campaigns;
	
	public CampaignDao() {
		
		this.campaigns = new ArrayList<Campaign>();
		this.campaigns.add(new Campaign(3, "Black Friday", 0.80));
		
	}
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " has been added to database.");
		
	}

	@Override
	public void list() {
		System.out.println("Campaigns are listed.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " has been updated to database.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " has been deleted from database.");
		
	}

	@Override
	public List<Campaign> getAll() {
		return this.campaigns;
	}

	
}

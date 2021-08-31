package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.CampaignService;
import etiyaGamesLayered.dataAccess.concretes.CampaignDao;
import etiyaGamesLayered.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	CampaignDao campaignDao;
	
	
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
		
	}

	@Override
	public void list() {
		campaignDao.list();
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
		
	}

	@Override
	public List<Campaign> getAll() {
		return campaignDao.getAll();
	}

}

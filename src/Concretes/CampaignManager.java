package Concretes;

import Abstarcts.CampaignService;
import Entities.Campaing;

public class CampaignManager implements CampaignService {

	@Override
	public void addCamping(Campaing campaing) {
		// TODO Auto-generated method stub
		System.out.println("Added Campaing : "+campaing.getCampaingName()+" "+
                campaing.getCampaingType()+" "+
                campaing.getCampaingPeriodOfValidity()+" "+
                campaing.getCampingDiscount());
	}

	@Override
	public void deleteCamping(Campaing campaing) {
		// TODO Auto-generated method stub
		System.out.println("Deleted Campaing : "+campaing.getCampaingName()+" "+
                campaing.getCampaingType()+" "+
                campaing.getCampaingPeriodOfValidity()+" "+
                campaing.getCampingDiscount());
	}

	@Override
	public void updateCamping(Campaing campaing) {
		// TODO Auto-generated method stub
		 System.out.println("Updated Campaing : "+campaing.getCampaingName()+" "+
	                campaing.getCampaingType()+" "+
	                campaing.getCampaingPeriodOfValidity()+" "+
	                campaing.getCampingDiscount());
	}
	

}

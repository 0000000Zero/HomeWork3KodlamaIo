package Entities;

public class Campaing 
{
	private int sId;
	private String campaingName;
	private String campaingType;
	private String campaingPeriodOfValidity;
	private double unitPrice;
	private double campingDiscount;
	
	public Campaing() { 
		
	}

	public Campaing(int sId, String campaingName, String campaingType, String campaingPeriodOfValidity,
			double unitPrice, double campingDiscount) {
		super();
		this.sId = sId;
		this.campaingName = campaingName;
		this.campaingType = campaingType;
		this.campaingPeriodOfValidity = campaingPeriodOfValidity;
		this.unitPrice = unitPrice;
		this.campingDiscount = campingDiscount;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public String getCampaingType() {
		return campaingType;
	}

	public void setCampaingType(String campaingType) {
		this.campaingType = campaingType;
	}

	public String getCampaingPeriodOfValidity() {
		return campaingPeriodOfValidity;
	}

	public void setCampaingPeriodOfValidity(String campaingPeriodOfValidity) {
		this.campaingPeriodOfValidity = campaingPeriodOfValidity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getCampingDiscount() {
		return campingDiscount;
	}

	public void setCampingDiscount(double campingDiscount) {
		this.campingDiscount = campingDiscount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - ( this.unitPrice * this.getCampingDiscount() / 100);
	}
	
}

package Com.Kanchan.Bean;

import java.util.List;

public class Order{
	  private String editionCode; 
	  private AddonOfferingCode addonOfferingCode; 
	  private String pricingDuration; 
	  private List<Items> items; 
	  private List<CustomAttributes> customAttributes; 

	  public String getEditionCode(){
	  	return editionCode; 
	  }
	  public void setEditionCode(String input){
	  	 this.editionCode = input;
	  }
	  public AddonOfferingCode getAddonOfferingCode(){
	  	return addonOfferingCode; 
	  }
	  public void setAddonOfferingCode(AddonOfferingCode input){
	  	 this.addonOfferingCode = input;
	  }
	  public String getPricingDuration(){
	  	return pricingDuration; 
	  }
	  public void setPricingDuration(String input){
	  	 this.pricingDuration = input;
	  }
	  public List<Items> getItems(){
	  	return items; 
	  }
	  public void setItems(List<Items> input){
	  	 this.items = input;
	  }
	  public List<CustomAttributes> getCustomAttributes(){
	  	return customAttributes; 
	  }
	  public void setCustomAttributes(List<CustomAttributes> input){
	  	 this.customAttributes = input;
	  }
}


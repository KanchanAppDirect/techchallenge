package Com.Kanchan.Bean;
import java.util.List;

public class Parent{
	  private String type; 
	  private Marketplace marketplace; 
	  private ApplicationUuid applicationUuid; 
	  private String flag; 
	  private Creator creator; 
	  private Payload payload; 
	  private String returnUrl; 
	  private List<Links> links; 

	  public String getType(){
	  	return type; 
	  }
	  public void setType(String input){
	  	 this.type = input;
	  }
	  public Marketplace getMarketplace(){
	  	return marketplace; 
	  }
	  public void setMarketplace(Marketplace input){
	  	 this.marketplace = input;
	  }
	  public ApplicationUuid getApplicationUuid(){
	  	return applicationUuid; 
	  }
	  public void setApplicationUuid(ApplicationUuid input){
	  	 this.applicationUuid = input;
	  }
	  public String getFlag(){
	  	return flag; 
	  }
	  public void setFlag(String input){
	  	 this.flag = input;
	  }
	  public Creator getCreator(){
	  	return creator; 
	  }
	  public void setCreator(Creator input){
	  	 this.creator = input;
	  }
	  public Payload getPayload(){
	  	return payload; 
	  }
	  public void setPayload(Payload input){
	  	 this.payload = input;
	  }
	  public String getReturnUrl(){
	  	return returnUrl; 
	  }
	  public void setReturnUrl(String input){
	  	 this.returnUrl = input;
	  }
	  public List<Links> getLinks(){
	  	return links; 
	  }
	  public void setLinks(List<Links> input){
	  	 this.links = input;
	  }
}
  
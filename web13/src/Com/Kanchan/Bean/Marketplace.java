package Com.Kanchan.Bean;

public class Marketplace{
	  private String partner; 
	  private String baseUrl; 

	  public String getPartner(){
	  	return partner; 
	  }
	  public void setPartner(String input){
	  	 this.partner = input;
	  	 System.out.println("partner "+ this.partner);
	  }
	  public String getBaseUrl(){
	  	return baseUrl; 
	  }
	  public void setBaseUrl(String input){
	  	 this.baseUrl = input;
	  }
}

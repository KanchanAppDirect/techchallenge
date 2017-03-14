package Com.Kanchan.Bean;

public class Company{
	  private String uuid; 
	  private ExternalId externalId; 
	  private String name; 
	  private String email; 
	  private String phoneNumber; 
	  private String website; 
	  private String country; 

	  public String getUuid(){
	  	return uuid; 
	  }
	  public void setUuid(String input){
	  	 this.uuid = input;
	  }
	  public ExternalId getExternalId(){
	  	return externalId; 
	  }
	  public void setExternalId(ExternalId input){
	  	 this.externalId = input;
	  }
	  public String getName(){
	  	return name; 
	  }
	  public void setName(String input){
	  	 this.name = input;
	  }
	  public String getEmail(){
	  	return email; 
	  }
	  public void setEmail(String input){
	  	 this.email = input;
	  }
	  public String getPhoneNumber(){
	  	return phoneNumber; 
	  }
	  public void setPhoneNumber(String input){
	  	 this.phoneNumber = input;
	  }
	  public String getWebsite(){
	  	return website; 
	  }
	  public void setWebsite(String input){
	  	 this.website = input;
	  }
	  public String getCountry(){
	  	return country; 
	  }
	  public void setCountry(String input){
	  	 this.country = input;
	  }
}

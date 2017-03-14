package Com.Kanchan.Bean;

public class Creator{
	  private String uuid; 
	  private String openId; 
	  private String email; 
	  private String firstName; 
	  private String lastName; 
	  private String language; 
	  private String locale; 
	  private Address address; 
	  private Attributes attributes; 

	  public String getUuid(){
	  	return uuid; 
	  }
	  public void setUuid(String input){
	  	 this.uuid = input;
	  }
	  public String getOpenId(){
	  	return openId; 
	  }
	  public void setOpenId(String input){
	  	 this.openId = input;
	  }
	  public String getEmail(){
	  	return email; 
	  }
	  public void setEmail(String input){
	  	 this.email = input;
	  }
	  public String getFirstName(){
	  	return firstName; 
	  }
	  public void setFirstName(String input){
	  	 this.firstName = input;
	  }
	  public String getLastName(){
	  	return lastName; 
	  }
	  public void setLastName(String input){
	  	 this.lastName = input;
	  }
	  public String getLanguage(){
	  	return language; 
	  }
	  public void setLanguage(String input){
	  	 this.language = input;
	  }
	  
	  public Address getAddress(){
	  	return address; 
	  }
	  public void setAddress(Address input){
	  	 this.address = input;
	  }
	  public Attributes getAttributes(){
	  	return attributes; 
	  }
	  public void setAttributes(Attributes input){
	  	 this.attributes = input;
	  }
	public void setLocale(String locale) {
		this.locale = locale;
	}
}

package Com.Kanchan.Bean;

public class Payload{
	  private User user; 
	  private Company company; 
	  private Account account; 
	  private AddonInstance addonInstance; 
	  private AddonBinding addonBinding; 
	  private Order order; 
	  private Notice notice; 
	  private Configuration configuration; 

	  public User getUser(){
	  	return user; 
	  }
	  public void setUser(User input){
	  	 this.user = input;
	  }
	  public Company getCompany(){
	  	return company; 
	  }
	  public void setCompany(Company input){
	  	 this.company = input;
	  }
	  public Account getAccount(){
	  	return account; 
	  }
	  public void setAccount(Account input){
	  	 this.account = input;
	  }
	  public AddonInstance getAddonInstance(){
	  	return addonInstance; 
	  }
	  public void setAddonInstance(AddonInstance input){
	  	 this.addonInstance = input;
	  }
	  public AddonBinding getAddonBinding(){
	  	return addonBinding; 
	  }
	  public void setAddonBinding(AddonBinding input){
	  	 this.addonBinding = input;
	  }
	  public Order getOrder(){
	  	return order; 
	  }
	  public void setOrder(Order input){
	  	 this.order = input;
	  }
	  public Notice getNotice(){
	  	return notice; 
	  }
	  public void setNotice(Notice input){
	  	 this.notice = input;
	  }
	  public Configuration getConfiguration(){
	  	return configuration; 
	  }
	  public void setConfiguration(Configuration input){
	  	 this.configuration = input;
	  }
}

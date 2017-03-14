package Com.Kanchan.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import Com.Kanchan.Bean.Parent;
import Com.Kanchan.util.DBConnectionManager;



public class CreateSubscriptionDao {
public void createSubscriptionDao(Parent parent) throws SQLException{
	
	Connection con = (Connection) DBConnectionManager.getConnection();
   
    
	 String partner=parent.getMarketplace().getPartner();
	 String baseUrl=parent.getMarketplace().getBaseUrl(); 
	 PreparedStatement st=con.prepareStatement("insert into MarketPlace(partner,baseUrl) values(?,?)");
	 try
	 {
	 st.setString(1,partner);
	 st.setString(2, baseUrl);
	 st.executeUpdate();
	 st.close();
	 }
       catch(Exception e)
	 {
     e.printStackTrace();
	 }
	 
	 
	  String uuid=parent.getCreator().getUuid(); 
	  String openId=parent.getCreator().getOpenId(); 
	  String email=parent.getCreator().getEmail(); 
	  String firstName=parent.getCreator().getFirstName(); 
	  String lastName=parent.getCreator().getLastName(); 
	 PreparedStatement st1=con.prepareStatement("insert into Creator(uuid,openId,email,firstName,lastName) values(?,?,?,?,?)");
	 try
	 {
	 st1.setString(1,uuid);
	 st1.setString(2,openId);
	 st1.setString(3,email);
	 st1.setString(4,firstName);
	 st1.setString(5,lastName);
	 
	 st1.executeUpdate();
	 st1.close();
	 }
       catch(Exception e)
	 {
     e.printStackTrace();
	 } 
	 
	 
	 
	  String uuid1 =parent.getPayload().getCompany().getUuid(); 
	  String name=parent.getPayload().getCompany().getName(); 
	  String email1=parent.getPayload().getCompany().getEmail(); 
	  String website=parent.getPayload().getCompany().getWebsite(); 
	 PreparedStatement st2=con.prepareStatement("insert into Company(uuid,name,email,website) values(?,?,?,?)");
	 try
	 {
	 st2.setString(1,uuid);
	 st2.setString(2,name);
	 st2.setString(3,email1);
	 st2.setString(4,website);
	 
	 st2.executeUpdate();
	 st2.close();
	 }
      catch(Exception e)
	 {
    e.printStackTrace();
	 } 
	 
	 
	 
	  String editionCode=parent.getPayload().getOrder().getEditionCode(); 
	  String pricingDuration=parent.getPayload().getOrder().getPricingDuration(); 	  
	 PreparedStatement st3=con.prepareStatement("insert into Order1(editionCode,pricingDuration) values(?,?)");
	 try
	 {
	 st3.setString(1,editionCode);
	 st3.setString(2,pricingDuration);	
	 
	 st3.executeUpdate();
	 st3.close();
	 }
      catch(Exception e)
	 {
    e.printStackTrace();
	 }
	 
	 
	
	 Random rand = new Random();

	 int  n = rand.nextInt(100000) + 1;
	 String accountIdentifier= "ACC" + n;
	   
	 PreparedStatement st4=con.prepareStatement("insert into Account(accountIdentifier,Status) values(?,?)");
	 try
	 {
	 st4.setString(1,accountIdentifier);
	 st4.setString(2,"Active");
	 st4.executeUpdate();
	
	 st4.close();
	 }
      catch(Exception e)
	 {
    e.printStackTrace();
	 }
	
	
}
}

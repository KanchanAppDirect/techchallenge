package Com.Kanchan.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Com.Kanchan.Bean.Parent;
import Com.Kanchan.util.DBConnectionManager;

public class CancelSubscriptionDao {
	
	public void cancelSubscriptionDao(Parent parent) throws SQLException{
		
		Connection con = (Connection) DBConnectionManager.getConnection();
		PreparedStatement st=con.prepareStatement("delete from Account where status=?");
		 try
		 {
		 st.setString(1,"Active");    
		st.execute();
		 }
	    catch(Exception e){
		e.printStackTrace();
	    }
		
		 PreparedStatement st1=con.prepareStatement("delete from MarketPlace where partner=?");
		 try
		 {
		 st1.setString(1,parent.getMarketplace().getPartner());    
		st1.execute();
		 }
	     catch(Exception e){
		 e.printStackTrace();
	      }
		 
		 
		 PreparedStatement st2=con.prepareStatement("delete from Creator where uuid=?");
		 try
		 {
		 st2.setString(1,parent.getCreator().getUuid());    
		 st2.execute();
		 }
	      catch(Exception e){
		  e.printStackTrace();
	      }
			 
		
		 
}
}
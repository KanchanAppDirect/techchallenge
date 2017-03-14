package Com.Kanchan.Services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import Com.Kanchan.Bean.Parent;
import Com.Kanchan.Dao.CreateSubscriptionDao;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;


public class CreateSubsrciptionServices {
	
	public void createSubscription(String eventUrl){

		ObjectMapper mapper=new ObjectMapper();
		try{
		OAuthConsumer consumer = new DefaultOAuthConsumer("demokanchan-154515", "Tnh4AAatc4OpCshg");		
		URL url = new URL(eventUrl);
	

		HttpURLConnection requestRes = (HttpURLConnection) url.openConnection();
		requestRes.setRequestProperty("Accept", "application/json");
		try {
			consumer.sign(requestRes);
		} catch (OAuthMessageSignerException e) {
		
			e.printStackTrace();
		} catch (OAuthExpectationFailedException e) {
		
			e.printStackTrace();
		} catch (OAuthCommunicationException e) {
		
			e.printStackTrace();
		}
		requestRes.connect();
	

		
		String l ="";
		String str = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(requestRes.getInputStream()));
	
		while((l = br.readLine())!=null)
		{
			str = str+l;
			
		}
		System.out.print("DATA READ now"+str);
		 Parent  parent = mapper.readValue(str,Parent.class);
		 System.out.println("Object Created");
	
		CreateSubscriptionDao createSubscriptionDao =new CreateSubscriptionDao();
		createSubscriptionDao.createSubscriptionDao(parent);
			
			
	}
     catch(Exception e){
	   e.printStackTrace();
       }

	}
		
	}



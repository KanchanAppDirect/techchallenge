package Com.Kanchan.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import Com.Kanchan.Services.CancelSubscriptionServices;

import ravi.model.ResponseSuccess;


@WebServlet("/CancelSubscription")
public class CancelSubscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CancelSubscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		CancelSubscriptionServices cancel=new CancelSubscriptionServices();
		response.setContentType("application/json");
		PrintWriter out=response.getWriter();
		String eventUrl =(String) request.getParameter("eventUrl");
		ObjectMapper mapper=new ObjectMapper();
		
		try{
		
		
		response.setStatus(200);
		cancel.cancelSubscription(eventUrl);
		 
		 ResponseSuccess responseObject= new ResponseSuccess();
		 responseObject.setSuccess(true);
			String json=mapper.writeValueAsString(responseObject);
			out.print(json);
			}
         catch(Exception e){
	       e.printStackTrace();
            }
	
	}

	

}

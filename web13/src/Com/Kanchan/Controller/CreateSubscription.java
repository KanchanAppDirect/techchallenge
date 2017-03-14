package Com.Kanchan.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import Com.Kanchan.Services.CreateSubsrciptionServices;
import ravi.model.ResponseSuccess;

@WebServlet("/CreateSubscription")
public class CreateSubscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CreateSubscription() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CreateSubsrciptionServices create=new CreateSubsrciptionServices();
		response.setContentType("application/json");
		PrintWriter out=response.getWriter();
		String eventUrl =(String) request.getParameter("eventUrl");
		ObjectMapper mapper=new ObjectMapper();
		
		try{
		
		
		response.setStatus(200);
		create.createSubscription(eventUrl);
		 
		 ResponseSuccess responseObject= new ResponseSuccess(true,"new-account-identifier");
			String json=mapper.writeValueAsString(responseObject);
			out.print(json);
			}
         catch(Exception e){
	       e.printStackTrace();
            }
	
		
	}

	

}

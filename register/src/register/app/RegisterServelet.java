package register.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RegisterServelet
 */
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String mail=(String)request.getParameter("email");
		String password=(String)request.getParameter("password");
		String rpassword=(String)request.getParameter("rpassword");
		PrintWriter ptr=response.getWriter();
		
		StringBuilder sbr=new StringBuilder();
		if((mail==null || mail.trim().equals("") || password==null || password.trim().equals("")) )
			sbr.append("enter the valid email and address<br>");
		
		else 
			if(!password.equals(rpassword))
				sbr.append("your password doesn't matched<br>");
		
		String result=sbr.toString();
		if(!result.equals("")) {
			//validation failed
			ptr.write("<html><body><h1>Error</h1><h2>"+result+"</h2></body></html>");
		}
		else {
		String s1="<html><body><h1>Success</h1><h3>you are successfully registered with us</h3><a href='login.html'>click here</a> <b>login</b></body></html>";
		ptr.write(s1);
		}
			
		
		
		
		
	}

}

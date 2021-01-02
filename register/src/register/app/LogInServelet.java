package register.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogInServelet
 */
public class LogInServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServelet() {
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
		PrintWriter ptr=response.getWriter();
		StringBuilder sbr=new StringBuilder();
		String email=(String)request.getParameter("email");
		String password=(String)request.getParameter("password");
		if((email==null || email.trim().equals("")) || (password==null || password.trim().equals("")))
			sbr.append("Please enter email to password to login<br>");
		
		
		String str=sbr.toString();
		if(!str.equals(""))
		ptr.write("<html><body> "+str+" </body></html>");
		else
		ptr.write("<html><body>Login  Successfull</body></html>");
	}

}

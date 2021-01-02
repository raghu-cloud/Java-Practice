

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Visits
 */
public class Visits extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int count=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
       
    public Visits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		String s="<html><head><title>This website is for no of visitors</title><body><h1>Number of visitors of this website is="+count+"</h1><body><html>";
		PrintWriter ptr=response.getWriter();
		ptr.write(s);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

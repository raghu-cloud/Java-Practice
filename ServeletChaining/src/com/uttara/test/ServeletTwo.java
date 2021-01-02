package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServeletTwo
 */
public class ServeletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletTwo() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Inside no argument constructor of the Servelet2");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 System.out.println("Inside doGet() of the Servelet2");
		// RequestDispatcher rd=request.getRequestDispatcher("/three");
		// rd.forward(request, response);
		// rd.include(request, response);
		/* PrintWriter ptr=response.getWriter();
		 ptr.write("<html><body>Inside Servelet 2<br></body></html>");*/
		 
		 
		 /*
		  * 1)Accessing the attached data of request,sessions and context
		  * 2)first create session with false and get all data and store into strings
		  * 3)check if all the data stored are not null if not null write into response.
		  */
		 
		 PrintWriter ptr=response.getWriter();
		 
		 HttpSession session=request.getSession(false);
		 ServletContext ctx=request.getServletContext();
		 
		 String s1="";
		 String s2="";
		 String s3="";
		 if(request.getAttribute("rd")!=null)
			s1=(String)request.getAttribute("rd");
		 if(session!=null && session.getAttribute("sd")!=null)
				s2=(String)session.getAttribute("sd");
		 if(ctx.getAttribute("cd")!=null)
			 s3=(String)ctx.getAttribute("cd");
			 
		
		 ptr.write("<html><body> Request data:"+s1+" Session Data:"+s2+" Context Data:"+s3+" </body></html>");
		 
		 
		 
		 
		 
		 
	
		 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 System.out.println("Inside doPost() of the Servelet2");
		
	}

}

package com.uttara.test;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServeletOne
 */
public class ServeletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServeletOne() {
       System.out.println("Inside no argument constructor of the Servelet1");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		 System.out.println("Inside doGet() of the Servelet1");
		 
		 
		 
		 /*
		  * 1)Attaching data to the response
		  * 2)Attaching data to the Session
		  * 3)Attaching data to the Context
		  */
		 
		 ServletContext sct=request.getServletContext();
		 HttpSession session =request.getSession(true);
		 
		 
		 request.setAttribute("rd","This is attached data to the request<br>");
		 session.setAttribute("sd", "This is attached data to the Session<br>");
		 sct.setAttribute("cd", "This is attached data to the ServletContext<br>");
		 
		 
		 
		 
		 
		 /*
			 * Constructor chaining with both forward and include
			 * 1)In Forward only last servelet writes.
			 * 2)In include we can append each writes of the servelets.
			 */
		
		 RequestDispatcher rd=request.getRequestDispatcher("/two");
		 rd.forward(request, response);
		/* rd.include(request, response);
		PrintWriter ptr=response.getWriter();
		 ptr.write("<html><body>Inside Servelet 1<br></body></html>");*/
		 
		 
		 
		 
		
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 
	}

}

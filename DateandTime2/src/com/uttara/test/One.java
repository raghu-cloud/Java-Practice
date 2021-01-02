package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class One
 */
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public One() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("inside no argument constructor of one");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 System.out.println("inside doget of one");
		 
		 PrintWriter ptr=response.getWriter();
		 
		 
		 String name=request.getParameter("uname");
		 String lname=request.getParameter("lname");
		
	     HttpSession session=request.getSession(true);
		 session.setAttribute("fname", name);
		 session.setAttribute("lname", lname);
		 ptr.write("<html><body><h1>Session created</h1></body></html>");
		 
		 
		
		
		 
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 System.out.println("inside dopost of one");
	}

}

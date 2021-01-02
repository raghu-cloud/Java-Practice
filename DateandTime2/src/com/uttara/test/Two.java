package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Two
 */
public class Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Two() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("inside no argument constructor of two");
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("inside doget of two");
		 HttpSession session=request.getSession(false);
		 PrintWriter ptr=response.getWriter();
		 if(session!=null ) {
		 String n1=(String) session.getAttribute("lname");
		 String n=(String) session.getAttribute("fname");
		 String str="<html><body><h1>Name="+n+" "+"Last name="+n1+"</body></html>";
		 ptr.write(str);
		 }
		 
		 else {
			 ptr.write(" <html><body><h1>Your cookie has been expired</h1></body></html>");
		 }
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

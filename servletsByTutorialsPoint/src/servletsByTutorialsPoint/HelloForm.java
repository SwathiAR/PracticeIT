package servletsByTutorialsPoint;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloForm
 */
@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("GET is called by post");
		PrintWriter pw = response.getWriter();
		
		String title = "Using GET method to Read form data";
		String docType =
			      "<!doctype html public \"-//w3c//dtd html 4.0 " +
			      "transitional//en\">\n";
		pw.println(docType +
				"<html>\n" + "<head><title>" + title + "</title></head>"
				+ "<body bgcolor = \"#f0f0f0\" >\n" + 
				"<h1 align= \"center\">" +  title + "</h1>\n"
						+ "<ul>\n" +
				"<li><b> First Name </b>" + request.getParameter("first name") + "\n"
				
				+
				"<li><b> Last Name </b>" + request.getParameter("last name") + "\n"
				
				+ "</ul><\n>" + "</body></html>");
				
				
				
		
		
		
		
	}
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		System.out.println("Using POST");
		doGet(request,response);
		
	}

}

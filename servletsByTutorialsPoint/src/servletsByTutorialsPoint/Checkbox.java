package servletsByTutorialsPoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Checkbox
 */
@WebServlet("/Checkbox")
public class Checkbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkbox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String title = "Reading Checkbox";
		String docType =    "<!doctype html public \"-//w3c//dtd html 4.0 " +
			      "transitional//en\">\n"; 
		pw.println(docType + "<html><title>" +  title + " </title> <body> <h1>" + title + "</h1> <h2>" + "The selected subjects are </h2>" + "<ul>\n" + "<li> Maths :  " + request.getParameter("math") +
				
				"</li>\n" + "<li>Physics : " + request.getParameter("physics") + "</li>\n" + "<li>Biology : " + request.getParameter("biology") + "</li>\n"
				+ "<li>Chemistry : " + request.getParameter("chemistry") );
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

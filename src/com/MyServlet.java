package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
 
public class MyServlet extends HttpServlet {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
 
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head><title>Servlet After Filter</title></head>");
      out.println("<body>");
      out.println("<h1>This servlet is invoked after the filter!</h1>"); 
      out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
      out.println("</body></html>");
      out.close();  
   }
}
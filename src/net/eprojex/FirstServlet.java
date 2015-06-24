package net.eprojex;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest rq, HttpServletResponse rs) {
		
		try {
		
		rs.setContentType("text/html");
		PrintWriter out = rs.getWriter();
		
		String n = rq.getParameter("userName");
		out.print("Welcome " + n);
		
		Cookie ck = new Cookie("uname", n);//creating the cookie object
		rs.addCookie(ck);//adding cookie in the response
		
		//creating submit button
		out.print("<form action='servlet2' method='post'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		
		out.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}

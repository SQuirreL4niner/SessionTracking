package net.eprojex;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(HttpServletRequest rq, HttpServletResponse rs) {
		
		try {
			
			rs.setContentType("text/html");
			PrintWriter out = rs.getWriter();
			
			Cookie ck[] = rq.getCookies();
			out.print("Hello " + ck[0].getValue());
			
			out.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

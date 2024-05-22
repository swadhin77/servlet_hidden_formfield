package test;
import java.io.*;
import jakarta.servlet.*;
@SuppressWarnings("serial")
public class servlet2 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String nm=req.getParameter("uname");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<h2 style ='color : blue;'>Welcome back "+nm+"</h2>");
	}

}

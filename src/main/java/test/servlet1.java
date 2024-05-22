package test;
import java.io.*;
import jakarta.servlet.*;
@SuppressWarnings("serial")
public class servlet1 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String nm=req.getParameter("name");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("welcome "+nm);
		pw.println("<form action='servlet2'>"
		
				+"<input type='hidden' name='uname' value='"+nm+"'/>"
		
				+"<button>Go to 2nd servlet</button>"
		
				+"</form>");
	}

}

package testegit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oi")
public class TesteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException {
		
		PrintWriter out = Response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Oi</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}

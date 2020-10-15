package web_app;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/sum"})
public class SumServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String n1=req.getParameter("no1");
	String n2=req.getParameter("no2");
	int x=Integer.parseInt(n1);
	int y=Integer.parseInt(n2);
	int z=x+y;
	PrintWriter writer=resp.getWriter();
	writer.print(z);
	writer.close();
}	

}

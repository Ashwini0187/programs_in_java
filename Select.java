package web_app;


	import java.io.PrintWriter;
	import java.io.Writer;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(urlPatterns= {"/sum"})
	public class Select extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  {
		String p=req.getParameter("principal");
		String r=req.getParameter("rate");
		String t=req.getParameter("time");
		int x=Integer.parseInt(p);

		int r=Integer.parseInt(r);
		int t=Integer.parseInt(t);
		
		
		int si=(p*r*t)/100;
		int emi=(p*si)/(t*12)
		PrintWriter writer=resp.getWriter();
		writer.print(z);
		writer.close();
	}	

}

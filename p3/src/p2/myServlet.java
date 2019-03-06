package p2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String username, String password) throws ServletException, IOException {
		String s=request.getParameter("username");
		String s1=request.getParameter("password");
		Check Sc=new Check();
		
		Sc.setUsername(s);
		Sc.setUsername(s1);
		
		if(Sc.checkLogin())
			
				{
			       RequestDispatcher log=request.getRequestDispatcher("Success.java");
			       request.setAttribute("user", s);
			       log.forward(request, response);
				}
		else
		{
			RequestDispatcher log=request.getRequestDispatcher("failure.java");
			log.forward(request, response);
		}
		
	}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.api.pipe.NextAction;

/**
 * Servlet implementation class HomeServelet
 */
@WebServlet("/HomeServelet")
public class HomeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // direct to home page and display the user info from session variable.
		String nexturl = "/UserDetails.jsp";
		HttpSession session =   request.getSession();
		User u = (User) session.getAttribute("User");
		
	 	String username  = u.getUsername();
		
		String message = "welcome "  + username;
		// set message to next jsp
		
		session.setAttribute("message",message);
		//response.sendRedirect(request.getContextPath() + nexturl);
		getServletContext().getRequestDispatcher(nexturl).forward(request, response);
		
	//	getServletContext()
		
		//response.sendRedirect(request.getContextPath() +"/"+nexturl);
		
		
		
		/*HttpSession session = request.getSession();
            	session.setAttribute("User", u);
            	jspname = "UserDetails.jsp";
            	response.sendRedirect(request.getContextPath() +"/"+jspname);
            	
            	
            	 s = "<h1>welcome "+ session.getAttribute(u.getUsername()) + ","+ session.getAttribute(u.getEmail()) + ":" 
            	 + session.getAttribute(u.getMotto()) +   	 "</h1>";
            	 out.println(s);
            	 request.getRequestDispatcher(jspname).include(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

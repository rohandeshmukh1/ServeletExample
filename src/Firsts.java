

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Firsts
 */
@WebServlet("/Firsts")
public class Firsts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Firsts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    response.setContentType("text/html");
            String email = request.getParameter("email");
            PrintWriter out = response.getWriter();
            String password = request.getParameter("password");
            String jspname;
            User u = new User();
            String s;
            
            if (password.equalsIgnoreCase("blue")) {
           // out.println("<h1>your email id is : "+ email + "</h1>");
          //  response.sendRedirect("NewFile.jsp");
           // request.getRequestDispatcher("output.jsp").include(request, response);
            	u.setEmail(email);
            	u.setPassword(password);
            	u.setUsername("userid123");
            	u.setMotto("My Motto");
            	
            	HttpSession session = request.getSession();
            	session.setAttribute("User", u);
            	session.setAttribute("editProfile",true);
            	 jspname = "output.jsp";
               // out.println(s);//request.setAttribute("message",s);
                 response.sendRedirect(request.getContextPath() +"/"+jspname);	
            	
            } else {
            	
            	  s = "<h1>Your password is incorrect</h1>";
                  
                 //  request.getRequestDispatcher("Login.jsp").include(request, response);
              jspname = "Login.jsp";
            out.println(s);//request.setAttribute("message",s);
            response.sendRedirect(request.getContextPath() +"/"+jspname);
          //  request.getServletContext().getRequestDispatcher(jspname).forward(request, response);
            
           // "<h1>Your password is incorrect </h1>");
            	
            	            	
            }
            
          //  String jspname = request.getParameter("nextPage");
           // out.println(s);//request.setAttribute("message",s);
           // response.sendRedirect(request.getContextPath() +"/" + jspname);
            
				//response.getWriter().append("Email ID is: ") + email;//.append(email);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	 
		
	}

}

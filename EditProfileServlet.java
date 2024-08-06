package cu.pu;
import jakarta.servlet.ServletException; import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
 
import jakarta.servlet.http.HttpServletResponse; import java.io.IOException;
/**
* Servlet implementation class EditProfileServlet */
public class EditProfileServlet extends HttpServlet { private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public EditProfileServlet() {
super(); }
/**

* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username = request.getParameter("username"); String email = request.getParameter("email");
String country = request.getParameter("country"); System.out.println("Updated Username: " + username);
System.out.println("Updated Email: " + email); System.out.println("Updated Country: " + country);
response.sendRedirect("profile.html");
} }

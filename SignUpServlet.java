package cu.pu;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest; import jakarta.servlet.http.HttpServletResponse;
 
import java.io.IOException;
import java.io.PrintWriter;
/**
* Servlet implementation class SignUpServlet */
public class SignUpServlet extends HttpServlet { private static final long serialVersionUID = 1L; /**
* @see HttpServlet#HttpServlet()
*/
 
public SignUpServlet() {
super();
// TODO Auto-generated constructor stub
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
56
// TODO Auto-generated method stub
String username = request.getParameter("username"); String email = request.getParameter("email");
String password = request.getParameter("password"); System.out.println("Username: " + username); System.out.println("Email: " + email);
System.out.println("Password: " + password); response.setContentType("text/html;charset=UTF-8"); PrintWriter out = response.getWriter(); out.println("<!DOCTYPE html>"); out.println("<html>");
out.println("<head>");
out.println("<meta charset=\"UTF-8\">");
out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"); out.println("<title>Sign Up Confirmation</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>Sign Up Successful!</h1>"); out.println("<p>Thank you for signing up, " + username + "!</p>"); out.println("</body>");
out.println("</html>");}}SingUpServlet.java

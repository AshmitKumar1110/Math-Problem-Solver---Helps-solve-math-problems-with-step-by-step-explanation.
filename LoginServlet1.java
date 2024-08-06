package cu.pu;
import jakarta.servlet.ServletException; import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; import java.io.IOException;
/**
* Servlet implementation class LoginServlet1 */
public class LoginServlet1 extends HttpServlet { private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public LoginServlet1() {
super(); }
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) */

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username = request.getParameter("username");
String password = request.getParameter("password"); boolean isAuthenticated = authenticate(username, password); if (isAuthenticated) {
response.sendRedirect("main.html"); } else {
response.sendRedirect("login.html?error=true"); }
}
private boolean authenticate(String username, String password) {
return username.equals("admin") && password.equals("admin123"); }
}

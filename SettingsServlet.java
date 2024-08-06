package cu.pu;
import jakarta.servlet.RequestDispatcher; import jakarta.servlet.ServletException; import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
 
import jakarta.servlet.http.HttpServletResponse; import java.io.IOException;
import java.io.PrintWriter;
/**
* Servlet implementation class SettingsServlet */
public class SettingsServlet extends HttpServlet { private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet() */
public SettingsServlet() { super();
// TODO Auto-generated constructor stub }
/**

* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub response.setContentType("text/html");
PrintWriter out = response.getWriter();
String action = request.getParameter("action");
if (action != null && action.equals("changePassword")) {
String currentPassword = request.getParameter("currentPassword"); String newPassword = request.getParameter("newPassword"); out.println("<h2>Password Updated Successfully</h2>");
} else if (action != null && action.equals("toggleNotifications")) {
String receiveNotifications = request.getParameter("receiveNotifications");
out.println("<h2>Notification Settings Saved</h2>"); } else {
out.println("<h2>Error: Invalid Action</h2>"); }}}

package cu.pu;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest; import jakarta.servlet.http.HttpServletResponse;
 
import java.io.IOException;
/**
* Servlet implementation class ContactServlet */
public class ContactServlet extends HttpServlet { private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public ContactServlet() {
super();
// TODO Auto-generated constructor stub }
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

    */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub String name = request.getParameter("name");
String name = request.getParameter("name"); String email = request.getParameter("email");
 String message = request.getParameter("message");
// Process the information (e.g., send email notification) System.out.println("New Contact Form Submission:"); System.out.println(" Name: " + name); System.out.println(" Email: " + email); System.out.println(" Message: " + message);
String successMessage = "Thank you for contacting us! We will respond to your message shortly.";
 response.setContentType("text/html");
response.getWriter().println("<!DOCTYPE html>");
response.getWriter().println("<html>");
response.getWriter().println("<head><title>Contact Us</title></head>");
response.getWriter().println("<body style='font-family: Arial, sans-serif; margin: 0; padding: 0;'>");
response.getWriter().println("<h1>Contact Form Submission</h1>");
response.getWriter().println("<div style='text-align: center; margin: 20px auto; padding: 20px; border: 1px solid #ddd; width: 50%;'>");

 
response.getWriter().println("<p style='font-size: 18px; color: green;'>" + successMessage + "</p>");
response.getWriter().println("</div>"); response.getWriter().println("</body>"); response.getWriter().println("</html>");
}
}

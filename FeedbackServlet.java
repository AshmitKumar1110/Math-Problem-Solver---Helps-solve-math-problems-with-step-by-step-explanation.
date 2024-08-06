package cu.pu;
import jakarta.servlet.ServletException; import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
 
import jakarta.servlet.http.HttpServletResponse; import java.io.IOException;
/**
* Servlet implementation class FeedbackServlet */
public class FeedbackServlet extends HttpServlet { private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public FeedbackServlet() {
super();
// TODO Auto-generated constructor stub }
/**

    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name = request.getParameter("name"); String email = request.getParameter("email");
 String feedback = request.getParameter("feedback");
System.out.println("Name: " + name); System.out.println("Email: " + email); System.out.println("Feedback: " + feedback);
String responseMessage = "Thank you for your feedback!"; response.setContentType("text/plain"); response.getWriter().println(responseMessage);
} }

 
    privacy.html:
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Privacy Policy - Math Problem Solver</title> <style>
body {
font-family: Arial, sans-serif;
background-color: #f4f4f4; margin: 0;
padding: 0;
}
.container { max-width: 800px;
 margin: 50px auto;
background-color: #fff;
padding: 20px;
border-radius: 8px;
box-shadow: 0 2px 5px rgba(0,0,0,0.1); }
h1 {
color: #333; text-align: center;

 
    }
p{
color: #666; line-height: 1.6; }
h2 {
 color: #007bff; }
</style> </head> <body>
<div class="container"> <h1>Privacy Policy</h1>
<p>This Privacy Policy describes how your personal information is collected, used, and shared when you visit or make a purchase from our website.</p>
<h2>Personal Information We Collect</h2>
  <p>We collect Device Information using the following technologies:</p> <ul>
<li>Cookies</li>
<li>Log files</li>
<li>Web beacons</li>
</ul>
<h2>How We Use Your Personal Information</h2> <p>We use the collected information to:</p>
<ul>

 
<li>Improve and optimize our website</li> <li>Analyze user behavior</li>
<li>Provide personalized advertisements</li> </ul>
<h2>Sharing Your Personal Information</h2>
<p>We may share your personal information with third parties in specific situations, such
 
as:</p>
<ul>
<li>With service providers</li>
<li>For legal purposes</li>
<li>With your consent</li>
</ul>
<h2>Changes to This Privacy Policy</h2>
<p>We may update our Privacy Policy from time to time. Any changes will be posted on this page.</p>
<h2>Contact Us</h2>
<p>If you have any questions about our Privacy Policy, please contact us at
privacy@example.com.</p> </div>
</body>
</html>

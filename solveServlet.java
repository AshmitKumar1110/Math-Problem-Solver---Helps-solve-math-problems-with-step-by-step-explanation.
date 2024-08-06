package cu.pu;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest; import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
* Servlet implementation class SolveServlet */
public class SolveServlet extends HttpServlet { private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public SolveServlet() {
super();
// TODO Auto-generated constructor stub }
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

    */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
String problem = request.getParameter("problem");
String solution = "Steps Using Substitution\r\n"
 negation.\r\n"
+ "2x−1=y,2y+3=x\r\n"
+ "Consider the first equation. Subtract y from both sides.\r\n"
+ "2x−1−y=0\r\n"
+ "Add 1 to both sides. Anything plus zero gives itself.\r\n"
+ "2x−y=1\r\n"
+ "Consider the second equation. Subtract x from both sides.\r\n"
+ "2y+3−x=0\r\n"
+ "Subtract 3 from both sides. Anything subtracted from zero gives its
+ "2y−x=−3\r\n"
+ "To solve a pair of equations using substitution, first solve one of the equations for one of the variables. Then substitute the result for that variable in the other
 equation.\r\n"
+ "2x−y=1,−x+2y=−3\r\n"
+ "Choose one of the equations and solve it for x by isolating x on the left hand side of the equal sign.\r\n"
+ "2x−y=1\r\n"
+ "Add y to both sides of the equation.\r\n" + "2x=y+1\r\n"
+ "Divide both sides by 2.\r\n"
+ "x= \r\n"

 
    + "2\r\n"
+ "1\r\n"
+ "\r\n"
+ " (y+1)\r\n"
+ "Multiply \r\n" + "2\r\n"
 + "1\r\n"
+ "\r\n"
+ " times y+1.\r\n" + "x= \r\n"
+ "2\r\n"
+ "1\r\n"
+ "\r\n"
+ " y+ \r\n"
+ "2\r\n"
+ "1\r\n"
 + "\r\n"
+ " \r\n"
+ "Substitute \r\n"
+ "2\r\n"
+ "1+y\r\n"
+ "\r\n"
+ " for x in the other equation, −x+2y=−3.\r\n" + "−( \r\n"
+ "2\r\n"

 
    + "1\r\n"
+ "\r\n"
+ " y+ \r\n" + "2\r\n"
+ "1\r\n"
+ "\r\n"
 + " )+2y=−3\r\n"
+ "Multiply −1 times \r\n" + "2\r\n"
+ "1+y\r\n"
+ "\r\n"
+ " .\r\n"
+ "− \r\n"
+ "2\r\n"
+ "1\r\n"
+ "\r\n"
 + " y− \r\n" + "2\r\n"
+ "1\r\n"
+ "\r\n"
+ " +2y=−3\r\n" + "Add − \r\n" + "2\r\n"
+ "y\r\n"
+ "\r\n"

 
    + " to 2y.\r\n" + "2\r\n"
+ "3\r\n"
+ "\r\n"
+ " y− \r\n" + "2\r\n"
 + "1\r\n"
+ "\r\n"
+ " =−3\r\n"
+ "Add \r\n"
+ "2\r\n"
+ "1\r\n"
+ "\r\n"
+ " to both sides of the equation.\r\n" + "2\r\n"
+ "3\r\n"
 + "\r\n"
+ " y=− \r\n"
+ "2\r\n"
+ "5\r\n"
+ "\r\n"
+ " \r\n"
+ "Divide both sides of the equation by \r\n" + "2\r\n"
+ "3\r\n"

 
    fraction.\r\n"
+ "\r\n"
+ " , which is the same as multiplying both sides by the reciprocal of the
+ "y=− \r\n" + "3\r\n"
+ "5\r\n"
 + "\r\n"
+ " \r\n"
+ "Substitute − \r\n" + "3\r\n"
+ "5\r\n"
+ "\r\n"
+ " for y in x= \r\n" + "2\r\n"
+ "1\r\n"
+ "\r\n"
 + " y+ \r\n" + "2\r\n"
+ "1\r\n"
+ "\r\n"
+ " . Because the resulting equation contains only one variable, you can solve for x directly.\r\n"
+ "x= \r\n" + "2\r\n" + "1\r\n" + "\r\n"

 
    + " (− \r\n" + "3\r\n"
+ "5\r\n"
+ "\r\n"
+ " )+ \r\n" + "2\r\n"
 + "1\r\n"
+ "\r\n"
+ " \r\n"
+ "Multiply \r\n" + "2\r\n"
+ "1\r\n"
+ "\r\n"
+ " times − \r\n" + "3\r\n"
+ "5\r\n"
 + "\r\n"
+ " by multiplying numerator times numerator and denominator times denominator. Then reduce the fraction to lowest terms if possible.\r\n"
+ "x=− \r\n" + "6\r\n"
+ "5\r\n"
+ "\r\n"
+ " + \r\n" + "2\r\n"

 
    + "1\r\n"
+ "\r\n"
+ " \r\n"
+ "Add \r\n" + "2\r\n"
+ "1\r\n"
 + "\r\n"
+ " to − \r\n"
+ "6\r\n"
+ "5\r\n"
+ "\r\n"
+ " by finding a common denominator and adding the numerators. Then
reduce the fraction to lowest terms if possible.\r\n" + "x=− \r\n"
+ "3\r\n" + "1\r\n"
 + "\r\n"
+ " \r\n"
+ "The system is now solved.\r\n" + "x=− \r\n"
+ "3\r\n"
+ "1\r\n"
+ "\r\n"
+ " ,y=− \r\n"
+ "3\r\n"

 
+ "5\r\n" + "\r\n" + "";
response.setContentType("text/plain"); // Set response content type response.getWriter().println(solution);
}}

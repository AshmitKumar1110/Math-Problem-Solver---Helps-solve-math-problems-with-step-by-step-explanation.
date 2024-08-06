package cu.pu;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest; import jakarta.servlet.http.HttpServletResponse;
 
import java.io.*;
/**
* Servlet implementation class HistoryServlet
*/
public class HistoryServlet extends HttpServlet { private static final long serialVersionUID = 1L; /**
* @see HttpServlet#HttpServlet()
*/
public HistoryServlet() {
 
super();
// TODO Auto-generated constructor stub
}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
48
    String[] timestamps = {"May 10, 2024, 15:30", "May 9, 2024, 14:45"};
String[] events = {"Solved equation: x^2 + 2x + 1 = 0", "Calculated the area of a circle"};
String[] descriptions = {"The equation was successfully solved using the quadratic formula.", "The area of a circle with radius 5 units was calculated as 78.54 square units."};
response.setContentType("text/html"); PrintWriter out = response.getWriter();
 out.println("<!DOCTYPE html>");
out.println("<html lang=\"en\">");
out.println("<head>");
out.println("<meta charset=\"UTF-8\">");
out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"); out.println("<title>History - Math Problem Solver</title>");
out.println("<style>");
out.println("body {");
out.println(" font-family: Arial, sans-serif;"); out.println(" background-color: #f4f4f4;");
 out.println(" margin: 0;");
out.println(" padding: 0;"); out.println("}");
out.println(".container {"); out.println(" max-width: 800px;"); out.println(" margin: 50px auto;"); out.println(" background-color: #fff;"); out.println(" padding: 20px;"); out.println(" border-radius: 8px;");
49
 
    out.println(" box-shadow: 0 2px 5px rgba(0,0,0,0.1);"); out.println("}");
out.println("h1 {");
out.println(" color: #333;");
out.println(" text-align: center;"); out.println("}");
 out.println(".history-item {");
out.println(" margin-bottom: 20px;");
out.println(" padding: 10px;");
out.println(" background-color: #f9f9f9;"); out.println(" border-radius: 4px;");
out.println(" box-shadow: 0 2px 5px rgba(0,0,0,0.1);"); out.println("}");
out.println(".timestamp {");
out.println(" color: #999;");
out.println(" font-size: 14px;");
 out.println(" margin-bottom: 5px;"); out.println("}");
out.println(".event {");
out.println(" color: #333;"); out.println(" font-weight: bold;"); out.println("}"); out.println(".description {"); out.println(" color: #666;"); out.println("}");
50
 
out.println("</style>"); out.println("</head>"); out.println("<body>");
out.println("<div class=\"container\">"); out.println("<h1>History</h1>");
for (int i = 0; i < timestamps.length; i++) {
out.println("<div class=\"history-item\">");
out.println("<div class=\"timestamp\">" + timestamps[i] + "</div>"); out.println("<div class=\"event\">" + events[i] + "</div>"); out.println("<div class=\"description\">" + descriptions[i] + "</div>"); out.println("</div>");
}
out.println("</div>");
out.println("</body>");
out.println("</html>");}}

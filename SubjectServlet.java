package cu.pu;
import java.util.*;
import jakarta.servlet.ServletException; import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
 
import jakarta.servlet.http.HttpServletResponse; import java.io.IOException;
/**
* Servlet implementation class SubjectServlet */
public class SubjectServlet extends HttpServlet { private static final long serialVersionUID = 1L; private Map<String, String> subjectDescriptions;
/**
* @see HttpServlet#HttpServlet() */
public SubjectServlet() {
subjectDescriptions = new HashMap<>();
subjectDescriptions.put("algebra", "Algebra deals with the manipulation of symbols...");
subjectDescriptions.put("geometry", "Geometry studies shapes, sizes, and spatial relationships...");
26
    subjectDescriptions.put("calculus", "Calculus is the mathematical study of change...");
// Add more subjects and descriptions as needed }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
 response) */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String subject = request.getParameter("subject");
if (subject != null && subjectDescriptions.containsKey(subject)) { String description = subjectDescriptions.get(subject);
 response.setContentType("text/html");
 response.getWriter().println("<!DOCTYPE html>");
 response.getWriter().println("<html>"); response.getWriter().println("<head>"); response.getWriter().println("<title>Subject Description</title>"); response.getWriter().println("<style>"); response.getWriter().println("body {"); response.getWriter().println(" font-family: Arial, sans-serif;"); response.getWriter().println(" margin: 0; padding: 0;"); response.getWriter().println("}"); response.getWriter().println("h1 {");
27
 
response.getWriter().println(" text-align: center;"); response.getWriter().println("}"); response.getWriter().println("p {"); response.getWriter().println(" padding: 20px;"); response.getWriter().println("}"); response.getWriter().println("</style>");
response.getWriter().println("</head>"); response.getWriter().println("<body>"); response.getWriter().println("<h1>" + subject + "</h1>"); response.getWriter().println("<p>" + description + "</p>"); response.getWriter().println("</body>"); response.getWriter().println("</html>");
} else {
// Subject not found, handle error or send a default message response.setContentType("text/plain"); response.getWriter().println("Subject not found.");
} }}

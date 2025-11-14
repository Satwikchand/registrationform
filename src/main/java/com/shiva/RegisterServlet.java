package com.shiva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String address = request.getParameter("address");
        String country = request.getParameter("country");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Success</title>");

        // CSS styling
        out.println("<style>");
        out.println("body { font-family: Arial; background:#f2f2f2; padding:30px; }");
        out.println("h2 { text-align:center; }");
        out.println("table { margin:auto; width:50%; border-collapse: collapse; background:white; }");
        out.println("table, th, td { border: 1px solid #ccc; padding: 12px; }");
        out.println("th { background: #1a73e8; color:white; text-align:left; }");
        out.println("td { background:#fafafa; }");
        out.println("a { display:block; text-align:center; margin-top:20px; }");
        out.println("</style>");

        out.println("</head>");
        out.println("<body>");

        out.println("<h2>Registration Successful</h2>");

        out.println("<table>");
        out.println("<tr><th>Field</th><th>Value</th></tr>");

        out.println("<tr><td>Name</td><td>" + firstName + " " + lastName + "</td></tr>");
        out.println("<tr><td>Email</td><td>" + email + "</td></tr>");
        out.println("<tr><td>Mobile</td><td>" + mobile + "</td></tr>");
        out.println("<tr><td>Gender</td><td>" + gender + "</td></tr>");
        out.println("<tr><td>Date of Birth</td><td>" + dob + "</td></tr>");
        out.println("<tr><td>Address</td><td>" + address + "</td></tr>");
        out.println("<tr><td>Country</td><td>" + country + "</td></tr>");

        out.println("</table>");

        out.println("<a href='registration.html'>Go Back</a>");

        out.println("</body></html>");
    }
}

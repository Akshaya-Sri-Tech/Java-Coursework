import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Register extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException,ServletException{

        res.setContentType("text/html");
        PrintWriter out=res.getWriter();

        String name=req.getParameter("name");
        int regno=Integer.parseInt(req.getParameter("regno"));
        float cgpa=Float.parseFloat(req.getParameter("cgpa"));

        out.println("<html><body>");
        out.println("<h2>Name : "+name+"</h2>");
        out.println("<h2>Register Number : "+regno+"</h2>");
        out.println("<h2>Your CGPA : "+cgpa+"</h2>");
        out.println("</body></html>");
    }
}
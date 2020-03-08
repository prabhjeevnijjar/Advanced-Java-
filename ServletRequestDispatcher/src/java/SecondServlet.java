import java.io.IOException
import java.io.PrintWriter
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
        
public class SecondServlet extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
    {
    PrintWriter out = res.getWriter();
    out.print("this is second servlet");
    String name = req.getParameter("t1");
  
    out.print("name");
    }
}
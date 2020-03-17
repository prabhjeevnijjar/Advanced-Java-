
package webapp;

import appLayer.user;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login")
public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //calling the objects of user method
        user obj = new user();

        String uid = request.getParameter("loginname");
        String pass = request.getParameter("loginpassword");
        
        PrintWriter out = response.getWriter();
        
        request.setAttribute("username",uid);
        request.setAttribute("password",pass);
        
        //using the user method object to feed data into attributes if isValidUserCredentioals method
        
        if(obj.isValidCredentials(uid,pass)) {
        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }
        else{
            
            String error = "Invalid attempt";
            request.setAttribute("errormessage",error);
                    request.getRequestDispatcher("/welcome.jsp").forward(request, response);

        out.print("INVALID CREDENTIALS !!");
    }
    }
}

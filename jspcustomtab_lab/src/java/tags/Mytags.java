
package tags;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Mytags extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        try {
            
            JspWriter out = pageContext.getOut();
            out.println("<h1>My name is : Prabhjeev Singh Nijjar</h1>");
            out.println("<h1>My enrollment number is : A12405217006/h1>");
            out.println("<h1>My section is : CSE11(X)</h1>");
            //now create tld file in web,inf
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return SKIP_BODY;
    }
    
    
}

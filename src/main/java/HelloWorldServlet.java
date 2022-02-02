import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String name = req.getParameter("name");
        name = name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1);
        PrintWriter out = res.getWriter();
        if (name.isEmpty()) {
            out.println("<h1>Hello, world!</h1>");
        } else {
            out.println("<h1>Hello, " + name + "!</h1>");
        }
    }
}


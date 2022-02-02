import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageViewCountServlet", urlPatterns = "/count")
public class PageViewCountServlet extends HttpServlet {
    private int viewCount = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String reset = req.getQueryString();
        PrintWriter out = res.getWriter();
        if (reset == null) {
            viewCount++;
        } else {
            viewCount = 0;
        }
        out.printf("<h1>Page has been viewed %d times", viewCount);
    }
}

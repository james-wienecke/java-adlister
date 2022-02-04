import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessLoseServlet", value = "/incorrect")
public class GuessLoseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess-outcome.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("guessResults", "WRONG");
        req.setAttribute("kindOfJob", "BAD");
        req.getRequestDispatcher("/guess-outcome.jsp").forward(req, resp);
    }
}

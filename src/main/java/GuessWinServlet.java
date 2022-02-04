import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessWinServlet", value = "/correct")
public class GuessWinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("correct GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("correct POST");
        req.setAttribute("guessResults", "RIGHT");
        req.setAttribute("kindOfJob", "GREAT");
        req.getRequestDispatcher("/guess-outcome.jsp").forward(req, resp);
    }
}

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessLoseServlet", value = "/incorrect")
public class GuessLoseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("wrong GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("wrong POST");
        req.setAttribute("guessResults", "WRONG");
        req.setAttribute("kindOfJob", "BAD");
        req.getRequestDispatcher("/guess-outcome.jsp").forward(req, resp);
    }
}

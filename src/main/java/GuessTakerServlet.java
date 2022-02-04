import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name="GuessTakerServlet", value="/guess")
public class GuessTakerServlet extends HttpServlet {
    protected int number;
    protected void generateGuessNumber() {
        Random rng = new Random();
        this.number = rng.nextInt(3);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
        generateGuessNumber();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String userGuess = req.getParameter("guess");
        try {
            int userGuess = Integer.parseInt(req.getParameter("guess"));
            if (userGuess == number) {
                // forward to winner servlet
            } else {
                // forward to loser servlet
            }
        } catch (NumberFormatException nfe) {
            req.setAttribute("badGuess", true);
            req.getRequestDispatcher("/guess.jsp").forward(req, resp);
        }

    }
}

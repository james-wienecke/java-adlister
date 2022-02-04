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
            if (userGuess > 3 || userGuess < 1) {
                req.setAttribute("badGuess", true);
                doGet(req, resp);
            }
            req.setAttribute("badGuess", false);
            req.setAttribute("guessNum", userGuess);
            req.setAttribute("tgtNum", number);

            if (userGuess == number) {
                // forward to winner servlet
                req.getRequestDispatcher("/correct").forward(req, resp);
            } else {
                // forward to loser servlet
                req.getRequestDispatcher("/incorrect").forward(req, resp);
            }
        } catch (NumberFormatException nfe) {
            req.setAttribute("badGuess", true);
//            req.getRequestDispatcher("/guess.jsp").forward(req, resp);
            doGet(req, resp);
        }

    }
}

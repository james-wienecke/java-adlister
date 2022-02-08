import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("loggedIn") == null) {
            request.getSession().setAttribute("loggedIn", false);
        }
        if ((boolean) request.getSession().getAttribute("loggedIn")) {
            request.getRequestDispatcher("/profile").forward(request, response);
        }
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String> validUsers = new HashMap<>();
        validUsers.put("admin", "password");
        validUsers.put("maldur", "thac0ruinedmylife");
        validUsers.put("gregtall", "okwhatever");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = validUsers.containsKey(username) && validUsers.containsValue(password);

        if (validAttempt) {
            request.getSession().setAttribute("loggedIn", true);
            request.getSession().setAttribute("name", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }

}

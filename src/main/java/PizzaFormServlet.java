import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet(name="PizzaFormServlet", urlPatterns="/pizza-order")
public class PizzaFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("/pizza-order.jsp");
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> params = req.getParameterNames();
        while(params.hasMoreElements()) {
            System.out.println(Arrays.toString(req.getParameterValues(params.nextElement())));
        }
    }
}

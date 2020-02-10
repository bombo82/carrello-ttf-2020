package carrellottf.web;

import carrellottf.backend.Carrello;
import carrellottf.backend.ProdottoRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/remove")
public class Remove extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("prod"));
        Carrello c = (Carrello) request.getSession().getAttribute("carrello");
        c.remove(ProdottoRepository.getInstance().getProdotto(id));
        response.sendRedirect("carrello.jsp");
    }

}

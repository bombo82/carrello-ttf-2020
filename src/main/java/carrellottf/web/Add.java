package carrellottf.web;

import carrellottf.backend.Carrello;
import carrellottf.backend.ProdottoRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class Add extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("prod"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        Carrello c = (Carrello) request.getSession().getAttribute("carrello");
        c.add(ProdottoRepository.getInstance().getProdotto(id), qty);
        response.sendRedirect("carrello.jsp");
    }

}

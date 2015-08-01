package exemples.jpa.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exemples.jpa.Ville;
import exemples.jpa.VilleDAO;

//@WebServlet("/VillesServlet")
public class VillesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VilleDAO dao = new VilleDAO();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Ville> villes = (List<Ville>) session.getAttribute("villes");
		if(villes==null)
			villes = new ArrayList<>();
		else
			villes.clear();
		for(Ville v : dao.getVillesByCodePostal(request.getParameter("cp"))){
			villes.add(v);
		}
		session.setAttribute("villes", villes);
		
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/show_villes.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

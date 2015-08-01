package exemples.jpa.servlets;

import java.io.IOException;

import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class JndiServlet
 */
public class JndiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @PersistenceContext(unitName="jpa") private EntityManager em;
       @Resource(name="jdbc/jpa") DataSource ds;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			InitialContext ctx = new InitialContext();
			//DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/jpa");
			System.out.println(em);
			System.out.println(ds);
		}
		catch (NamingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

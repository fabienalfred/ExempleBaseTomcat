package exemples.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VilleDAO {
	private EntityManager em;
	
	public VilleDAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("france");
		em = emf.createEntityManager();
	}
	
	public List<Ville> getVillesByCodePostal(String cp){
		Query query = em.createNamedQuery("Ville.getVillesByCodePostal");
		query.setParameter("cp", cp+"%");
		return query.getResultList();
	}
}

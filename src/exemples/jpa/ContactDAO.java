package exemples.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ContactDAO {
	private EntityManager em;
	
	public ContactDAO()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		em = emf.createEntityManager();
	}
	
	public void save(Contact contact)
	{
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(contact);
		transaction.commit();
	}
	
	public void delete(Contact contact)
	{
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.remove(contact);
		transaction.commit();
	}
}

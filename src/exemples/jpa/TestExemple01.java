package exemples.jpa;

public class TestExemple01 {

	public static void main(String[] args) {
		Contact c1 = new Contact("M","LAGAFFE","Gaston");
		ContactDAO dao = new ContactDAO();
		dao.save(c1);

	}

}

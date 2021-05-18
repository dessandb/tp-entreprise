package sopra.entreprise;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stages");

		emf.close();

	}

}

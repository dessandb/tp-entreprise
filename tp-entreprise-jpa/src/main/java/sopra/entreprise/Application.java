package sopra.entreprise;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.entreprise.repository.IPersonneRepository;
import sopra.entreprise.repository.jpa.PersonneRepositoryJpa;

public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp-entreprise-jpa");

	private final IPersonneRepository personneRepo = new PersonneRepositoryJpa();
	
	private Application() {

	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IPersonneRepository getPersonneRepo() {
		return personneRepo;
	}

}

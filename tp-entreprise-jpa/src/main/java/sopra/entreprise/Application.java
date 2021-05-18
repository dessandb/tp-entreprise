package sopra.entreprise;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.entreprise.repository.IEntrepriseRepository;
import sopra.entreprise.repository.jpa.EntrepriseRepositoryJpa;



public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpvol-jpa");
	private final IEntrepriseRepository entrepriseRepo = new EntrepriseRepositoryJpa();
	
	

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
	
	public IEntrepriseRepository getEvaluationRepo() {
		return entrepriseRepo;
	}


}

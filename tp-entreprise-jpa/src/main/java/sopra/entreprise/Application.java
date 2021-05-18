package sopra.entreprise;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.entreprise.repository.IPersonneRepository;
import sopra.entreprise.repository.IPropositionStageRepository;
import sopra.entreprise.repository.jpa.PersonneRepositoryJpa;
import sopra.entreprise.repository.jpa.PropositionStageRepositoryJpa;
import sopra.entreprise.repository.IConventionRepository;
import sopra.entreprise.repository.IEntrepriseRepository;
import sopra.entreprise.repository.IEtudiantContactEntrepriseRepository;
import sopra.entreprise.repository.IEtudiantRepository;
import sopra.entreprise.repository.jpa.ConventionRepositoryJpa;
import sopra.entreprise.repository.jpa.EntrepriseRepositoryJpa;
import sopra.entreprise.repository.jpa.EtudiantContactEntrepriseRepositoryJpa;
import sopra.entreprise.repository.jpa.EtudiantRepositoryJpa;



public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp-entreprise-jpa");

	private final IPersonneRepository personneRepo = new PersonneRepositoryJpa();
	private final IEntrepriseRepository entrepriseRepo = new EntrepriseRepositoryJpa();
	private final IConventionRepository conventionRepo = new ConventionRepositoryJpa();
	private final IEtudiantRepository etudiantRepo = new EtudiantRepositoryJpa();
	private final IEtudiantContactEntrepriseRepository etudiantcontactentrepriseRepo = new EtudiantContactEntrepriseRepositoryJpa();
	private final IPropositionStageRepository propositionRepo = new PropositionStageRepositoryJpa();
	
	
	
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

	public IPersonneRepository getPersonneRepo() {
		return personneRepo;
	}

	public IEntrepriseRepository getEntrepriseRepo() {
		return entrepriseRepo;
	}

	public IConventionRepository getConventionRepo() {
		return conventionRepo;
	}

	public IEtudiantRepository getEtudiantRepo() {
		return etudiantRepo;
	}

	public IEtudiantContactEntrepriseRepository getEtudiantcontactentrepriseRepo() {
		return etudiantcontactentrepriseRepo;
	}

	public IPropositionStageRepository getPropositionRepo() {
		return propositionRepo;
	}
	
	

}

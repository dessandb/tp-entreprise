package sopra.entreprise.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Etudiant")
public class Etudiant extends Personne {
	
	@Column(name="Prenom")
	private String prenom;
	@OneToMany(mappedBy = "etud")
	private List<EtudiantContactEntreprise> etudiantscontactsentreprises;
	

	public Etudiant() {
		super();
	}

	public Etudiant(String prenom) {
		super();
		this.prenom = prenom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<EtudiantContactEntreprise> getEtudiantscontactsentreprises() {
		return etudiantscontactsentreprises;
	}

	public void setEtudiantscontactsentreprises(List<EtudiantContactEntreprise> etudiantscontactsentreprises) {
		this.etudiantscontactsentreprises = etudiantscontactsentreprises;
	}
	
	
	
	

}

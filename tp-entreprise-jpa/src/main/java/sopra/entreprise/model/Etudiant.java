package sopra.entreprise.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Etudiant")
public class Etudiant extends Personne {
	
	@Column(name="Prenom")
	private String prenom;
	
	

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
	
	

}

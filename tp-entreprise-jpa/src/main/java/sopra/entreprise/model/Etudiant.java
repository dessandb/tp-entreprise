package sopra.entreprise.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Etudiant")
public class Etudiant extends Personne {
	
	@Column(name="Prenom")
	private String prenom;
	@ManyToOne
	@JoinColumn(name="EtudiantContactEntreprise_Id")
	private EtudiantContactEntreprise contact_etud;
	

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

	public EtudiantContactEntreprise getContact_etud() {
		return contact_etud;
	}

	public void setContact_etud(EtudiantContactEntreprise contact_etud) {
		this.contact_etud = contact_etud;
	}

	
	
	
	
	

}

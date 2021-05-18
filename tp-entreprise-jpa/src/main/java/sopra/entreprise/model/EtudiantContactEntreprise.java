package sopra.entreprise.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="etudiant_contact_entreprise")
public class EtudiantContactEntreprise {
	@Id
	@GeneratedValue
	private Long id;
	@OneToMany(mappedBy="contact")
	private List<Entreprise> ents;
	@OneToMany(mappedBy="contact_etud")
	private List<Etudiant> etudiants;
	@Column(name="DatePriseContact")
	private Date DatePriseContact;
	
	public EtudiantContactEntreprise() {
		super();
	}



	public EtudiantContactEntreprise(Date datePriseContact) {
		super();
		DatePriseContact = datePriseContact;
	}



	



	public EtudiantContactEntreprise(List<Entreprise> ents, List<Etudiant> etudiants, Date datePriseContact) {
		super();
		this.ents = ents;
		this.etudiants = etudiants;
		DatePriseContact = datePriseContact;
	}


	public List<Entreprise> getEnts() {
		return ents;
	}



	public void setEnts(List<Entreprise> ents) {
		this.ents = ents;
	}



	public List<Etudiant> getEtudiants() {
		return etudiants;
	}



	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}



	public Date getDatePriseContact() {
		return DatePriseContact;
	}



	public void setDatePriseContact(Date datePriseContact) {
		DatePriseContact = datePriseContact;
	}
	
	
	

}

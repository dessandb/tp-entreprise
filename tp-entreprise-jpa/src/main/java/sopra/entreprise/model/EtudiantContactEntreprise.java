package sopra.entreprise.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="etudiant_contact_entreprise")
public class EtudiantContactEntreprise {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn("Etudiant_Numero")
	private Etudiant etud;
	@ManyToOne
	@JoinColumn("Entreprise_Numero")
	private Entreprise ent;
	@Column(name="DatePriseContact")
	private Date DatePriseContact;
	
	
	
	public EntrepriseContactEtudiant() {
		super();
	}

	

	public EntrepriseContactEtudiant(Date datePriseContact) {
		super();
		DatePriseContact = datePriseContact;
	}



	public EntrepriseContactEtudiant(Etudiant etud, Entreprise ent, Date datePriseContact) {
		super();
		this.etud = etud;
		this.ent = ent;
		DatePriseContact = datePriseContact;
	}



	public Etudiant getEtud() {
		return etud;
	}



	public void setEtud(Etudiant etud) {
		this.etud = etud;
	}



	public Entreprise getEnt() {
		return ent;
	}



	public void setEnt(Entreprise ent) {
		this.ent = ent;
	}



	public Date getDatePriseContact() {
		return DatePriseContact;
	}



	public void setDatePriseContact(Date datePriseContact) {
		DatePriseContact = datePriseContact;
	}
	
	
	

}

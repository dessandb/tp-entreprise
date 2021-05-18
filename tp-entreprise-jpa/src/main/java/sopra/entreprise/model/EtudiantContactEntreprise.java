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
	@JoinColumn(name="Entreprise_Numero")
	private Entreprise entreprise;
	@ManyToOne
	@JoinColumn(name="Etudiant_Numero")
	private Etudiant etudiant;
	@Column(name="DatePriseContact")
	private Date DatePriseContact;
	
	public EtudiantContactEntreprise() {
		super();
	}



	public EtudiantContactEntreprise(Date datePriseContact) {
		super();
		DatePriseContact = datePriseContact;
	}
	
	public EtudiantContactEntreprise(Entreprise entreprise, Etudiant etudiant, Date datePriseContact) {
		super();
		this.entreprise = entreprise;
		this.etudiant = etudiant;
		DatePriseContact = datePriseContact;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Entreprise getEntreprise() {
		return entreprise;
	}



	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}



	public Etudiant getEtudiant() {
		return etudiant;
	}



	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}




	public Date getDatePriseContact() {
		return DatePriseContact;
	}



	public void setDatePriseContact(Date datePriseContact) {
		DatePriseContact = datePriseContact;
	}
	
	
	

}

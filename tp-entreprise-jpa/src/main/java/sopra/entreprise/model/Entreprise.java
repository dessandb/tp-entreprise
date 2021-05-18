package sopra.entreprise.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Personne {
	
	@Column(name="address")
	private String adresse;
	@ManyToOne(mappedBy="ent")
	EtudiantContactEntreprise contact;
	
	public Entreprise() {
		super();
		this.adresse = null;
		this.contact = null;
	}
	
	public Entreprise(String adr, EtudiantContactEntreprise contact) {
		super();
		this.adresse = adr;
		this.contact = contact;
	}

	public String getAdr() {
		return adresse;
	}

	public void setAdr(String adr) {
		this.adresse = adr;
	}

	public EtudiantContactEntreprise getContact() {
		return contact;
	}

	public void setContact(EtudiantContactEntreprise contact) {
		this.contact = contact;
	}
	
	
	
	
	

}

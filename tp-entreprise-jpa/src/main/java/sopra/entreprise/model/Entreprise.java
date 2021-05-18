package sopra.entreprise.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Personne {
	
	@Column(name="address")
	private String adresse;
	@ManyToOne
	@JoinColumn(name = "EtudiantContactEntreprise_Id")
	EtudiantContactEntreprise contact;
	@OneToMany(mappedBy="entreprise")
	List<PropositionStage> propositions_stages;
	
	public Entreprise() {
		super();
		this.adresse = null;
		this.contact = null;
		this.propositions_stages = null;
	}
	
	public Entreprise(String adr, EtudiantContactEntreprise contact) {
		super();
		this.adresse = adr;
		this.contact = contact;
		this.propositions_stages = null;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public EtudiantContactEntreprise getContact() {
		return contact;
	}

	public void setContact(EtudiantContactEntreprise contact) {
		this.contact = contact;
	}

	public List<PropositionStage> getPropositions_stages() {
		return propositions_stages;
	}

	public void setPropositions_stages(List<PropositionStage> propositions_stages) {
		this.propositions_stages = propositions_stages;
	}
	
	
	
	
	

}

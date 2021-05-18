package sopra.entreprise.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Personne {
	
	@Column(name="adresse")
	private String adresse;
	@OneToMany(mappedBy="entreprise")
	private List<EtudiantContactEntreprise> contacts_ents;
	@OneToMany(mappedBy="entreprise")
	private List<PropositionStage> propositions_stages;
	

	public Entreprise() {
		super();
	}
	
	

	public Entreprise(String adresse) {
		super();
		this.adresse = adresse;
	}



	public Entreprise(String adresse, List<EtudiantContactEntreprise> contacts_ents,
			List<PropositionStage> propositions_stages) {
		super();
		this.adresse = adresse;
		this.contacts_ents = contacts_ents;
		this.propositions_stages = propositions_stages;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	

	public List<EtudiantContactEntreprise> getContacts_ents() {
		return contacts_ents;
	}



	public void setContacts_ents(List<EtudiantContactEntreprise> contacts_ents) {
		this.contacts_ents = contacts_ents;
	}



	public List<PropositionStage> getPropositions_stages() {
		return propositions_stages;
	}

	public void setPropositions_stages(List<PropositionStage> propositions_stages) {
		this.propositions_stages = propositions_stages;
	}
	
	
	
	
	

}

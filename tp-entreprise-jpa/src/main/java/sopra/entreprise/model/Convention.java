package sopra.entreprise.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="convention")
public class Convention {
	@Id
	@GeneratedValue
	//@Column(name="numero")
	private Integer numero;
	@Column(name="remunerationFinale")
	private Long RemunerationFinale;
	@Column(name="sujetMemoire")
	private String SujetMemoire;
	@Column(name="dateDebut")
	private Date DateDebut;
	@Column(name="dateSignature")
	private Date DateSignature;
	@Column(name="derniereDateVisiteEnseignant")
	private Date DerniereDateVisiteEnseignant;
	@OneToOne
    @JoinColumn(name = "etudiant_id")
	private Etudiant etudiant;
	@OneToOne
    @JoinColumn(name = "propStage_id")
	private PropositionStage propStage;
	@ManyToOne
	@JoinColumn(name = "enseignant_id")
	private Enseignant enseignant;
	
	public Convention() {
		super();
	}
	
	
	
	public Convention(Long remunerationFinale, String sujetMemoire, Date dateDebut, Date dateSignature,
			Date derniereDateVisiteEnseignant) {
		super();
		RemunerationFinale = remunerationFinale;
		SujetMemoire = sujetMemoire;
		DateDebut = dateDebut;
		DateSignature = dateSignature;
		DerniereDateVisiteEnseignant = derniereDateVisiteEnseignant;
	}



	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Long getRemunerationFinale() {
		return RemunerationFinale;
	}
	public void setRemunerationFinale(Long remunerationFinale) {
		RemunerationFinale = remunerationFinale;
	}
	public String getSujetMemoire() {
		return SujetMemoire;
	}
	public void setSujetMemoire(String sujetMemoire) {
		SujetMemoire = sujetMemoire;
	}
	public Date getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	public Date getDateSignature() {
		return DateSignature;
	}
	public void setDateSignature(Date dateSignature) {
		DateSignature = dateSignature;
	}
	public Date getDerniereDateVisiteEnseignant() {
		return DerniereDateVisiteEnseignant;
	}
	public void setDerniereDateVisiteEnseignant(Date derniereDateVisiteEnseignant) {
		DerniereDateVisiteEnseignant = derniereDateVisiteEnseignant;
	}
	
	
}

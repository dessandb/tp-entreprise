package sopra.entreprise.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="convention")
public class Convention {
	@Id
	@Column(name="numero")
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
    @JoinColumn(name = "etudiant")
	Etudiant etudiant = new Etudiant;
	@OneToOne
    @JoinColumn(name = "propStage")
	PropositionStage propStage = new PropositionStage();
	@ManyToOne
	@JoinColumn(name = "enseignant")
	Enseignant enseignant = new Enseignant;
	
	public Convention() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Convention(Integer numero, Long remunerationFinale, String sujetMemoire, Date dateDebut, Date dateSignature,
			Date derniereDateVisiteEnseignant) {
		super();
		this.numero = numero;
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

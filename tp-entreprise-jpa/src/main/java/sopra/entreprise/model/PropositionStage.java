package sopra.entreprise.model;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="internship_offer")
public class PropositionStage {
	@Id
	@GeneratedValue
	int id;
	@Column(name="subject_offer")
	String sujet_propose;
	@Column(name="date_offer")
	Date date_proposee;
	@Column(name="duration")
	int duree;
	@Column(name="pay")
	double remuneration;
	@ManyToOne
	@JoinColumn(name="id")
	Entreprise entreprise;
	@OneToOne(mappedBy="propStage")
	Convention convention;
	
	public PropositionStage() {
		super();
	}
	
	public PropositionStage(String sujet_propose, Date date_proposee, int duree, double remuneration) {
		super();
		this.sujet_propose = sujet_propose;
		this.date_proposee = date_proposee;
		this.duree = duree;
		this.remuneration = remuneration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSujet_propose() {
		return sujet_propose;
	}
	public void setSujet_propose(String sujet_propose) {
		this.sujet_propose = sujet_propose;
	}
	public Date getDate_proposee() {
		return date_proposee;
	}
	public void setDate_proposee(Date date_proposee) {
		this.date_proposee = date_proposee;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getRemuneration() {
		return remuneration;
	}
	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public Convention getConvention() {
		return convention;
	}
	public void setConvention(Convention convention) {
		this.convention = convention;
	}
}
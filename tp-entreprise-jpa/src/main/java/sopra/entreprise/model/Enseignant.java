package sopra.entreprise.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Enseignant")
public class Enseignant extends Personne {

	@OneToMany(mappedBy = "enseignant")
	private List<Convention> conventions = new ArrayList<Convention>();

	public Enseignant() {
		super();
	}

	public List<Convention> getConventions() {
		return conventions;
	}

	public void setConventions(List<Convention> conventions) {
		this.conventions = conventions;
	}

}

package domain.manyToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: L
 *
 */
@Entity
public class L implements Serializable {

	private Integer idL;
	private static final long serialVersionUID = 1L;

	private List<K> ks;

	public L() {
		super();
	}

	@Id
	public Integer getIdL() {
		return this.idL;
	}

	public void setIdL(Integer idL) {
		this.idL = idL;
	}

	@ManyToMany
	public List<K> getKs() {
		return ks;
	}

	public void setKs(List<K> ks) {
		this.ks = ks;
	}

}

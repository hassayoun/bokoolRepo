package domain.oneToManyUniSlaveMaster;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: J
 *
 */
@Entity
public class J implements Serializable {

	private Integer idJ;
	private static final long serialVersionUID = 1L;

	private List<I> is;

	public J() {
		super();
	}

	@Id
	public Integer getIdJ() {
		return this.idJ;
	}

	public void setIdJ(Integer idJ) {
		this.idJ = idJ;
	}

	@OneToMany
	public List<I> getIs() {
		return is;
	}

	public void setIs(List<I> is) {
		this.is = is;
	}

}

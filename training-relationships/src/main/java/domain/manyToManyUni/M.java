package domain.manyToManyUni;

import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: M
 *
 */
@Entity

public class M implements Serializable {

	
	private Integer idM;
	private static final long serialVersionUID = 1L;
	
	private List<N> ns;

	public M() {
		super();
	}   
	@Id    
	public Integer getIdM() {
		return this.idM;
	}

	public void setIdM(Integer idM) {
		this.idM = idM;
	}
	@ManyToMany
	public List<N> getNs() {
		return ns;
	}
	public void setNs(List<N> ns) {
		this.ns = ns;
	}
   
}

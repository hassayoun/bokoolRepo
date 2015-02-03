package domain.manyToManyUni;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: N
 *
 */
@Entity

public class N implements Serializable {

	
	private Integer idN;
	private static final long serialVersionUID = 1L;

	public N() {
		super();
	}   
	@Id    
	public Integer getIdN() {
		return this.idN;
	}

	public void setIdN(Integer idN) {
		this.idN = idN;
	}
   
}

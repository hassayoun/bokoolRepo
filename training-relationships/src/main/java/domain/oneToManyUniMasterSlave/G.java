package domain.oneToManyUniMasterSlave;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: G
 *
 */
@Entity

public class G implements Serializable {

	
	private Integer idG;
	private static final long serialVersionUID = 1L;
	
	private H h;

	public G() {
		super();
	}   
	@Id    
	public Integer getIdG() {
		return this.idG;
	}

	public void setIdG(Integer idG) {
		this.idG = idG;
	}
	@ManyToOne
	public H getH() {
		return h;
	}
	public void setH(H h) {
		this.h = h;
	}
   
}

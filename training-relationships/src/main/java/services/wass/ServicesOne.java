package services.wass;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ServicesOne
 */
@Stateless
public class ServicesOne implements ServicesOneRemote, ServicesOneLocal {

	/**
	 * Default constructor.
	 */
	public ServicesOne() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayAhla() {
		System.out.println("ahla b chahla ...");
	}

}

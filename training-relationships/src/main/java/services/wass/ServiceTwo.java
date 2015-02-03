package services.wass;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ServiceTwo
 */
@Stateless
public class ServiceTwo implements ServiceTwoRemote, ServiceTwoLocal {
	@EJB
	private ServicesOneLocal servicesOneLocal;

	/**
	 * Default constructor.
	 */
	public ServiceTwo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consumeOne() {
		servicesOneLocal.sayAhla();

	}

}

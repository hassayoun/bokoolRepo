package services;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class GreetingsServices
 */
@Stateless
public class GreetingsServices implements GreetingsServicesRemote,
		GreetingsServicesLocal {

	/**
	 * Default constructor.
	 */
	public GreetingsServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tiSalem() {
		System.out.println("Salémou 3alaykom");

	}

}

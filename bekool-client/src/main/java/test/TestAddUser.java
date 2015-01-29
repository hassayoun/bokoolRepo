package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserServicesRemote;
import domain.User;

public class TestAddUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup("/bekool/UserServices!"
						+ UserServicesRemote.class.getCanonicalName());

		User user = new User();
		user.setId(2);
		user.setName("foufou");

		proxy.addUser(user);
	}

}

package net.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.model.Login;
import net.java.repository.LoginRepository;

@Service
public class LoginService implements ILoginService {

	@Autowired
	private LoginRepository repo;
	@Override
  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
}

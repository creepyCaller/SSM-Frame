package cn.edu.cuit.fpc.service;

import cn.edu.cuit.fpc.model.T_User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

	public int login(String userName, String password);

	public int findUser(String userName);

	public void registerUser(T_User user);

	public int findUserByEmail(String Email);

	public void changePasswordByUsername(String password, String userName);

	public void changePasswordByEmail(String password, String email);

	@Transactional(readOnly = true)
	public List<T_User> findAll();

}

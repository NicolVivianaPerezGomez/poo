package co.edu.ue.Service;

import java.util.List;

import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import co.edu.ue.entity.User;
import co.edu.ue.repository.UserData;

//Empezaremos con la inyeccion de dependencias
//Inyeccion por campo o atributo


@Service
public class UserService implements IUserService {

	private UserData data;
	
	@Value("${code}")
	double code;
	
	//private final int NUM_CODE = 100; 
	//1. Inyeccion por Constructor usamos source 
		public UserService(UserData data) {
			this.data = data;
	}

	@Override
	public List<User> getAllUser() {
		return data.getListUser();
	}

	@Override
	public List<User> getAllUserChangeId() {
/*stream Listas doblemente enlazadas el stream recorre toda la lista y trasnforma lo que necesito*/
		return data.getListUser().stream().map(
				u->{
					//casteo de tipos de datos numericos
					//long value = u.getId()*100; para pasarlo a short
					short value =(short) (u.getId()*code);
					User user = new User(value,u.getName(),u.getLastname(),u.getMail());
					return user;
					
				}).collect(Collectors.toList());
	}

	@Override
	public User getByMail(String email) {
		return data.getUserByMail(email);
	}

	@Override
	public User getById(Integer id) {
		return data.getUserById(id);
	}

	@Override
	public List<User> getSaveUser(User user) {
		return data.postUser(user);
	}

	@Override
	public List<User> deleteUserById(Integer id) {
		return data.deleteUser(id);
	}

	@Override
	public List<User> updateUserById(Integer id, User updatedUser) {
		return data.deleteUser(id);
	}

}

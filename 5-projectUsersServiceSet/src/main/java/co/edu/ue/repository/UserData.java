package co.edu.ue.repository;

import org.springframework.stereotype.Repository;
import co.edu.ue.entity.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Esta es mi clase que van a simular los datos mi clase de acceso a los datos

@Repository
public class UserData { // Fuente de datos

	// Aqui hago un list con mi clase generica es list es un atributo de tipo
	// coleccion

	List<User> listUsers;
	// Construtor

	public UserData() {
		super();
		this.listUserData();
	}

	public void listUserData() {
		this.listUsers = new ArrayList<User>(Arrays.asList(
				new User(1, "SANTIAGO", "AVILA", "SANTIAGO@GMAIL.COM"),
				new User(2, "SEBASTIAN", "PEREZ", "SEBASTIAN@GMAIL.COM"),
				new User(3, "NOAH", "GOMEZ", "NOAH@GMAIL.COM"), 
				new User(4, "SARA", "QUINTERO", "SARA@GMAIL.COM"),
				new User(5, "LEONEL", "PEREZ", "LEONEL@GMAIL.COM"),
				new User(6, "SANDRA", "FLOREZ", "SANDRA@GMAIL.COM")));
	}

	public List<User> getListUser() {
		return this.listUsers;
	}

	public User getUserByMail(String email) {
		for (User s : this.listUsers) {// itera y compara datos
			if (s.getMail().contains(email)) {// la "s" es una variable iteradora como i
				return s;
			}
		}
		return null;
	}

	public User getUserById(Integer id) {
		return this.listUsers.stream().filter(i -> i.getId().equals(id)).findFirst().orElseThrow(); // Stream me permite
																									// trabajar con
																									// colecciones de
																									// una forma optima
	}

	public List<User> postUser(User user) {
		boolean response = this.listUsers.add(user);
		if (response) {
			return this.listUsers;
		}
		return null;
	}

	public List<User> deleteUser(Integer id) {
		this.listUsers.removeIf(u -> u.getId().equals(id));
		return this.listUsers;
	}

	public List<User> updatedUser(Integer id, User updatedUser) {
		listUsers.replaceAll(user -> {
			if (user.getId().equals(id)) {
				user.setName(updatedUser.getName());
				user.setLastname(updatedUser.getLastname());
				user.setMail(updatedUser.getMail());
				// Actualiza aquí los demás atributos del usuario
				return user;
			}
			return user;
		});
		return listUsers;
	}

}

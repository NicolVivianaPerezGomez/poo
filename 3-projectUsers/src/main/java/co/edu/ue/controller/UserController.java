package co.edu.ue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ue.entity.User;
import co.edu.ue.repository.UserData;

@RestController
@RequestMapping(value = "api")
public class UserController {

	UserData data = new UserData(); // Fuente de datos a traves de instanciacion

	// Retorna todos los usuarios
	@GetMapping(value = "users")
	public List<User> getAllUsers() {
		return data.getListUser();
	}

	// Retorna un usuario por correo
	@GetMapping(value = "user-mail")
	public User getUserEmail(@RequestParam("email") String correo) {
		return data.getUserByMail(correo);
	}

	// Retorna un usuario por id
	@GetMapping(value = "user-id")
	public User getUserId(@RequestParam Integer id) {
		return data.getUserById(id);
	}

	// Retorna un usuario nuevo "agregar un usuario nuevo"
	@PostMapping(value = "user-add")
	public List<User> postUser(@RequestBody User user) {
		return data.postUser(user);
	}

	// Eliminar el usuario
	@DeleteMapping(value = "user-delete")
	public List<User> deleteUser(@RequestParam("id") Integer id) {
		return data.deleteUser(id);
	}
	
	//Actualizar usuario
	@PutMapping(value = "user-update")
	public List<User> updateUser(@RequestParam("id") Integer id, @RequestBody User updatedUser) {
	    return data.updatedUser(id, updatedUser);
	}

}

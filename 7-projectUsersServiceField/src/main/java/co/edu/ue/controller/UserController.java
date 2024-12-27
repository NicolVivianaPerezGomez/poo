package co.edu.ue.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ue.Service.IUserService;
import co.edu.ue.entity.User;


@RestController
@RequestMapping(value = "api")
public class UserController {

	//VAMOS A EVOLUCIONAR EL PROYECTO UserData data = new UserData(); // Fuente de datos a traves de instanciacion

	//Inyeccion por Interface osea comunicacion por interface como debe estar el proyecto
	
	@Autowired
	IUserService service; //cableamos la interface
	
	/*
	* END POINTS
	*
	*
	**/
	// Retorna todos los usuarios
	@GetMapping(value = "users")
	public List<User> getAllUsers() {
		return service.getAllUser(); //por lo tanto se cambia data. por service.
	}
	
	// Retorna todos los usuarios con el id cambiado
	@GetMapping(value = "users-id")
	public List<User> getAllUsersIdChange() {
		return service.getAllUserChangeId(); //por lo tanto se cambia data. por service.
	}

	// Retorna un usuario por correo
	@GetMapping(value = "user-mail")
	public User getUserEmail(@RequestParam("email") String correo) {
		return service.getByMail(correo);
	}

	// Retorna un usuario por id
	@GetMapping(value = "user-id")
	public User getUserId(@RequestParam Integer id) {
		return service.getById(id);
	}

	// Retorna un usuario nuevo "agregar un usuario nuevo"
	@PostMapping(value = "user-add")
	public List<User> postUser(@RequestBody User user) {
		return service.getSaveUser(user);
	}

	// Eliminar el usuario
	@DeleteMapping(value = "user-delete")
	public List<User> deleteUser(@RequestParam("id") Integer id) {
		return service.deleteUserById(id);
	}
	
	//Actualizar usuario
	@PutMapping(value = "user-update")
	public List<User> updateUser(@RequestParam("id") Integer id, @RequestBody User updatedUser) {
	    return service.updateUserById(id, updatedUser);
	}
	

}

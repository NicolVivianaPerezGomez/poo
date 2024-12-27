package co.edu.ue.Service;

import java.util.List;

import co.edu.ue.entity.User;

public interface IUserService { //Las interface son un contrato que debe cumplir la clase que la implemente 

	List <User> getAllUser(); 
	List <User> getAllUserChangeId();
	User getByMail(String email);
	User getById (Integer id);
	List<User>getSaveUser(User user);
	List<User>deleteUserById(Integer id);
	List<User> updateUserById(Integer id, User updatedUser);

}

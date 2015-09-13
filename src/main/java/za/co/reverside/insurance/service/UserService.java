package za.co.reverside.insurance.service;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import za.co.reverside.insurance.model.UserCommandModel;
import za.co.reverside.insurance.model.UserQueryModel;

@RestController
public class UserService {

    @RequestMapping(value = "api/users", method = RequestMethod.POST, consumes = "application/json")
	public void createUser(@RequestBody UserCommandModel user){

	}

    @RequestMapping(value = "api/users/{id}", method = RequestMethod.GET, produces = "application/json")
	public UserQueryModel getUser(@PathVariable("id")  Long id){
		return null;
	}

    @RequestMapping(value = "api/users", method = RequestMethod.GET, produces = "application/json")
	public List<UserQueryModel>  getUsers(){
		return null;
	}
} 
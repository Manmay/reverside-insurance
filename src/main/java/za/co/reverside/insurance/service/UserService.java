package za.co.reverside.insurance.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import za.co.reverside.insurance.domain.User;

import static za.co.reverside.insurance.mapper.Mapper.toUserQueryModel;
import za.co.reverside.insurance.model.UserQueryModel;
import za.co.reverside.insurance.repository.UserRepository;

@RestController
public class UserService {
    
    
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "api/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserQueryModel> findAllUsers() {
        List<za.co.reverside.insurance.domain.User> users = userRepository.findAll();
        List<UserQueryModel> result = toUserQueryModel(users);
        return result;
    }

    @RequestMapping(value = "api/users/{id}", method = RequestMethod.GET, produces = "application/json")
	public User getUser(@PathVariable("id")  Long id){          
            User users = userRepository.findOne(id);
		return users;
	}
} 
package za.co.reverside.insurance.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import za.co.reverside.insurance.domain.Policy;
import za.co.reverside.insurance.mapper.Mapper;
import za.co.reverside.insurance.model.PolicyCommandModel;
import za.co.reverside.insurance.repository.PolicyRepository;

@RestController
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @RequestMapping(value = "api/policy", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addPolicy(@RequestBody PolicyCommandModel policyCommandModel) {
        System.out.println("[Start] Create a new policy");
        Policy policy = Mapper.toPolicy(policyCommandModel);
        policyRepository.save(policy);
        System.out.println("[Finish] Create a new policy");
    }
       
    @RequestMapping(value = "api/policy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Policy> getAllPolicys(){
        return policyRepository.findAll();
    }
    
     @RequestMapping(value = "api/policy/{id}", method = RequestMethod.GET, produces = "application/json")
	public Policy getPolicy(@PathVariable("id")  Long id){          
            Policy policy = policyRepository.findOne(id);
		return policy;
	}
}

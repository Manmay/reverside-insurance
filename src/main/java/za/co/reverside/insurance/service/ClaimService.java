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
import za.co.reverside.insurance.domain.Claim;
import za.co.reverside.insurance.mapper.Mapper;
import za.co.reverside.insurance.model.ClaimCommandModel;
import za.co.reverside.insurance.repository.ClaimRepository;

@RestController
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @RequestMapping(value = "api/claims", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addClaim(@RequestBody ClaimCommandModel claimCommandModel) {
        System.out.println("[Start] Create a new claim");
        Claim claim = Mapper.toClaim(claimCommandModel);
        claimRepository.save(claim);
        System.out.println("[Finish] Create a new claim");
       
       
    }

    @RequestMapping(value = "api/claims/{id}", method = RequestMethod.GET,produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public Claim getClaim(@PathVariable("id")  Long id){          
            Claim claim = claimRepository.findOne(id);
            System.out.println("[Start] Extract claim informatiom");
		return claim;
	}

    @RequestMapping(value = "api/claims", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }
}

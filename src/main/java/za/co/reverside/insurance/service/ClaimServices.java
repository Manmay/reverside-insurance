package za.co.reverside.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import za.co.reverside.insurance.domain.Claim;
import static za.co.reverside.insurance.mapper.Mapper.toClaim;
import za.co.reverside.insurance.model.ClaimCommandModel;
import za.co.reverside.insurance.repository.ClaimRepository;

@RestController
public class ClaimServices {

    @Autowired
    private ClaimRepository claimRepository;

    @Transactional
    @RequestMapping(value = "api/claim", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addClaim(@RequestBody ClaimCommandModel command) {
        Claim claim = toClaim(command);
        claimRepository.save(claim);
        System.out.println("Claim Posted ");
    }
}

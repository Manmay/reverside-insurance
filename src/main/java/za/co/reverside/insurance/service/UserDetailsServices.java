package za.co.reverside.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import za.co.reverside.insurance.domain.UserDetails;
import za.co.reverside.insurance.repository.UserDetailsRepository;

@RestController
public class UserDetailsServices {
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    
//Creating the POST Method
   @Transactional
   @RequestMapping(value = "api/userDetails", method = RequestMethod.POST, consumes = "application/json")
   @ResponseStatus(value = HttpStatus.CREATED)
   public void createQuotation(@RequestBody UserDetails quotationCommand) {
       userDetailsRepository.save(quotationCommand);
   }
}

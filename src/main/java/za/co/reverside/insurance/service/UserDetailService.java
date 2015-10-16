package za.co.reverside.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import za.co.reverside.insurance.domain.UserDetail;
import static za.co.reverside.insurance.mapper.Mapper.fromuserDetail;
import za.co.reverside.insurance.model.UserCommandModel;
import za.co.reverside.insurance.repository.UserDetailRepository;

@RestController
public class UserDetailService {

    @Autowired
    private UserDetailRepository userDetailRepository;

    @RequestMapping(value = "api/create-user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void  createuser(@RequestBody UserCommandModel userCommandModel) {

        UserDetail userDetail = fromuserDetail(userCommandModel);
        userDetailRepository.save(userDetail);
        
         System.out.println("Saved Successfully");
    }
}

package za.co.reverside.insurance.mapper;

import java.util.ArrayList;
import java.util.List;
import za.co.reverside.insurance.domain.User;
import za.co.reverside.insurance.domain.UserDetail;
import za.co.reverside.insurance.model.UserCommandModel;
import za.co.reverside.insurance.model.UserQueryModel;

public class Mapper {

   
public static UserQueryModel toUserQueryModel(User from) {
        UserQueryModel user = new UserQueryModel();
        user.setId(from.getId());
        user.setUserName(from.getUserName());
        user.setRole(from.getRole());
        user.setImage(from.getImage());
        return user;
    }

    public static List<UserQueryModel> toUserQueryModel(List<User> fromList) {
        List<UserQueryModel> userList = new ArrayList<UserQueryModel>();
        for (User user : fromList) {
            userList.add(toUserQueryModel(user));
        }
        return userList;
    }
    
    public static UserDetail fromuserDetail(UserCommandModel userCommandModel){
        
        UserDetail userDetail = new UserDetail();
        userDetail.setUserName(userCommandModel.getName());
        userDetail.setSurname(userCommandModel.getSurname());
        userDetail.setEmail(userCommandModel.getEmail());
        userDetail.setPhoneNo(userCommandModel.getPhoneNumber());
        return userDetail;
    }
   

}

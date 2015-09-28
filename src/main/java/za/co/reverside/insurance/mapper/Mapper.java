<<<<<<< HEAD
package za.co.reverside.insurance.mapper;

import java.util.ArrayList;
import java.util.List;
import za.co.reverside.insurance.domain.Claim;
import za.co.reverside.insurance.domain.User;
import za.co.reverside.insurance.model.ClaimQueryModel;
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
public static ClaimQueryModel toClaimQueryModel(Claim from){
    ClaimQueryModel claim = new ClaimQueryModel();
    //claim.setTitle(from.getTitle());
    return claim;
}
   public static List<ClaimQueryModel> toClaimQueryModel(List<Claim> fromList){
       List<ClaimQueryModel> claimList = new ArrayList<ClaimQueryModel>();
       for(Claim claim:fromList){
           claimList.add(toClaimQueryModel(claim));
       }
       return claimList;
   }

}
=======
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
>>>>>>> 37a1cc0b5adc6dba90c7d8b539aa798caa57494d

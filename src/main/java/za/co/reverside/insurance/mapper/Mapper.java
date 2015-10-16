package za.co.reverside.insurance.mapper;

import java.util.ArrayList;
import java.util.List;
import za.co.reverside.insurance.domain.Claim;
import za.co.reverside.insurance.domain.Client;
import za.co.reverside.insurance.domain.Policy;
import za.co.reverside.insurance.domain.User;
import za.co.reverside.insurance.domain.UserDetail;
import za.co.reverside.insurance.model.ClaimCommandModel;
import za.co.reverside.insurance.model.ClientCommandModel;
import za.co.reverside.insurance.model.PolicyCommandModel;
import za.co.reverside.insurance.model.UserCommandModel;
import za.co.reverside.insurance.model.UserQueryModel;
import za.co.reverside.insurance.model.ClaimQueryModel;
import za.co.reverside.insurance.model.PolicyQueryModel;
import za.co.reverside.insurance.model.ClientQueryModel;
import za.co.reverside.insurance.service.ENotificationService;

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

    public static UserDetail fromuserDetail(UserCommandModel userCommandModel) {

        UserDetail userDetail = new UserDetail();
        userDetail.setUserName(userCommandModel.getName());
        userDetail.setSurname(userCommandModel.getSurname());
        userDetail.setEmail(userCommandModel.getEmail());
        userDetail.setPhoneNo(userCommandModel.getPhoneNumber());
        return userDetail;
    }

    public static Claim toClaim(ClaimCommandModel from) {
        ENotificationService eservice = new ENotificationService();
        Claim claim = new Claim();

        claim.setPolicyId(from.getPolicyId());
        claim.setClientId(from.getClientId());
        claim.setTitle(from.getTitle());
        claim.setFirstName(from.getFirstName());
        claim.setLastName(from.getLastName());
        claim.setIdentityNo(from.getIdentityNo());
        claim.setContactNo(from.getContactNo());
        claim.setEmail(from.getEmail());
        claim.setCompanyName(from.getCompanyName());
        claim.setAgent(from.getAgent());
        claim.setPhysicalAddress(from.getPhysicalAddress());
        claim.setPostalAddress(from.getPostalAddress());
        claim.setIncidentDate(from.getIncidentDate());
        claim.setIncidentLoc(from.getIncidentLoc());
        claim.setLocation(from.getLocation());
        claim.setOccupation(from.getOccupation());
        claim.setLossType(from.getLossType());
        claim.setIncidentDescription(from.getIncidentDesription());
        claim.setThirdPartyName(from.getThirdPartyName());
        claim.setThirdPartyContact(from.getThirdPartyContact());
        claim.setInsurerName(from.getInsurerName());
        claim.setPoliceStation(from.getPoliceStationName());
        claim.setReportDate(from.getReportDate());
        claim.setCaseNo(from.getCaseNo());
        claim.setAdditionalDocuments(from.getAdditionalDocuments());
        claim.setImages(from.getImages());
      //claim.setStatus("NEW");

        String to = claim.getEmail();
        String title = claim.getTitle();
        String fname = claim.getFirstName();
        String lname = claim.getLastName();
        long clientId = from.getId();
        eservice.sendMail(to,title,fname,lname, clientId);

        return claim;
    }

    public static ClaimQueryModel toClaimQueryModel(Claim from) {
        ClaimQueryModel claim = new ClaimQueryModel();

        claim.setId(from.getId());
        claim.setFirstName(from.getFirstName());
        claim.setLastName(from.getLastName());
        claim.setIdentityNo(from.getIdentityNo());
        claim.setContactNo(from.getContactNo());
        claim.setEmail(from.getEmail());
        claim.setCompanyName(from.getCompanyName());
        claim.setAgent(from.getAgent());
        claim.setPhysicalAddress(from.getPhysicalAddress());
        claim.setPostalAddress(from.getPostalAddress());
        claim.setIncidentDate(from.getIncidentDate());
        claim.setIncidentLoc(from.getIncidentLoc());
        claim.setLocation(from.getLocation());
        claim.setOccupation(from.getOccupation());
        claim.setLossType(from.getLossType());
        claim.setIncidentDesription(from.getIncidentDescription());
        claim.setThirdPartyName(from.getThirdPartyName());
        claim.setThirdPartyContact(from.getThirdPartyContact());
        claim.setInsurerName(from.getInsurerName());
        claim.setPoliceStationName(from.getPoliceStation());
        claim.setReportDate(from.getReportDate());
        claim.setCaseNo(from.getCaseNo());

        return claim;
    }

    public static List<ClaimQueryModel> toClaimQueryModel(List<Claim> fromList) {
        List<ClaimQueryModel> claimList = new ArrayList<ClaimQueryModel>();
        for (Claim claim : fromList) {
            claimList.add(toClaimQueryModel(claim));
        }
        return claimList;
    }

    public static Policy toPolicy(PolicyCommandModel from) {
        Policy policy = new Policy();
        policy.setPolicyType(from.getStartDate());
        policy.setStart_date(from.getStartDate());
        policy.setEnd_date(from.getEndDate());

        Client client = new Client();

        return policy;
    }

    public static PolicyQueryModel toPolicyQueryModel(Policy from) {
        Client client = new Client();
        client.setId(from.getId());

        PolicyQueryModel policy = new PolicyQueryModel();
        policy.setId(from.getId());
        policy.setPolicyType(from.getPolicyType());
        policy.setStartDate(from.getStart_date());
        policy.setEndDate(from.getEnd_date());
        // policy.setClient(client);

        return policy;
    }

    public static List<PolicyQueryModel> toPolicyQueryModels(List<Policy> fromList) {
        List<PolicyQueryModel> policyList = new ArrayList<PolicyQueryModel>();
        for (Policy policy : fromList) {
            policyList.add(toPolicyQueryModel(policy));
        }
        return policyList;
    }

    public static Client toClient(ClientCommandModel from) {
        Client client = new Client();

        client.setFirstName(from.getFirstName());
        client.setLastName(from.getLastName());
        client.setIdentityNo(from.getIdentityNo());
        client.setContactNo(from.getContactNo());
        client.setEmail(from.getEmail());
        client.setTitle(from.getTitle());
        client.setAgent(from.getAgent());
        client.setCompanyName(from.getCompanyName());
        client.setPhysicalAddress(from.getPhysicalAddress());
        client.setPostalAddress(from.getPostalAddress());

        return client;
    }

    public static ClientQueryModel toClientQueryModel(Client from) {
        ClientQueryModel client = new ClientQueryModel();

        client.setId(from.getId());
        client.setFirstName(from.getFirstName());
        client.setLastName(from.getLastName());
        client.setIdentityNo(from.getIdentityNo());
        client.setContactNo(from.getContactNo());
        client.setEmail(from.getEmail());
        client.setTitle(from.getTitle());
        client.setAgent(from.getAgent());
        client.setCompanyName(from.getCompanyName());
        client.setPhysicalAddress(from.getPhysicalAddress());
        client.setPostalAddress(from.getPostalAddress());

        return client;
    }

    public static List<ClientQueryModel> toClientQueryModels(List<Client> fromList) {
        List<ClientQueryModel> clientList = new ArrayList<ClientQueryModel>();
        for (Client client : fromList) {
            clientList.add(toClientQueryModel(client));
        }
        return clientList;
    }
}

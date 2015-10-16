package za.co.reverside.insurance.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claims")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "policy_id")
    private long policyId;

    @Column(name = "client_id")
    private long clientId;

    @Column(name = "title")
    private String title;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "identity_no")
    private Long identityNo;
    
    @Column(name = "contact_no")
    private String contactNo;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "company_name")
    private String companyName;
    
    @Column(name = "agent")
    private String agent;
    
    @Column(name = "physical_address")
    private String physicalAddress;
    
    @Column(name = "postal_address")
    private String postalAddress;
    
    @Column(name = "incident_date")
    private String incidentDate;
    
    @Column(name = "incident_loc")
    private String incidentLoc;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "occupation")
    private String occupation;
    
    @Column(name = "loss_type")
    private String lossType;

    @Column(name = "incident_desription")
    private String incidentDescription;
    
    @Column(name = "third_party_name")
    private String thirdPartyName;
    
    @Column(name = "third_party_contact")
    private String thirdPartyContact;
    
    @Column(name = "insurer_name")
    private String insurerName;
    
    @Column(name = "police_station_name")
    private String policeStation;
    
    @Column(name = "report_date")
    private String reportDate;
    
    @Column(name = "case_no")
    private String caseNo;
    
    @Column(name = "images")
    private byte[] images;
    
    @Column(name = "additional_documents")
    private byte[] additionalDocuments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(long policyId) {
        this.policyId = policyId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(Long identityNo) {
        this.identityNo = identityNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getIncidentLoc() {
        return incidentLoc;
    }

    public void setIncidentLoc(String incidentLoc) {
        this.incidentLoc = incidentLoc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLossType() {
        return lossType;
    }

    public void setLossType(String lossType) {
        this.lossType = lossType;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public String getThirdPartyName() {
        return thirdPartyName;
    }

    public void setThirdPartyName(String thirdPartyName) {
        this.thirdPartyName = thirdPartyName;
    }

    public String getThirdPartyContact() {
        return thirdPartyContact;
    }

    public void setThirdPartyContact(String thirdPartyContact) {
        this.thirdPartyContact = thirdPartyContact;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    public byte[] getAdditionalDocuments() {
        return additionalDocuments;
    }

    public void setAdditionalDocuments(byte[] additionalDocuments) {
        this.additionalDocuments = additionalDocuments;
    }
    
   
}

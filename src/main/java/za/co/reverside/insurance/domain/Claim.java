/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.reverside.insurance.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RSS-INTERN
 */
@Entity
@Table(name = "claim")
public class Claim {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_no")
    private int claimNo;
    @Column(name = "policyNo")
    private int policyNo;
    @Column(name = "policy_type")
    private String policy_type;
    @Column(name = "incident_type")
    private String incident;
    @Column(name = "title")
    private String title;
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;
    @Column(name = "identityNo")
    private String idNo;
    @Column(name = "contactNo")
    private String contactNo;
    @Column(name = "email")
    private String email;
    @Column(name = "incident_location")
    private String location;
    @Column(name = "incident_date")
    private Date date;
    @Column(name = "incident_description")
    private String description;
    @Column(name = "passanger_status")
    private String status;
    @Column(name = "noOfPassangers")
    private String noPassangers;
    @Column(name = "damage_description")
    private String damage;
    @Column(name = "police_report")
    private String report;

    public int getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(int claimNo) {
        this.claimNo = claimNo;
    }

    public int getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(int policyNo) {
        this.policyNo = policyNo;
    }

    public String getPolicy_type() {
        return policy_type;
    }

    public void setPolicy_type(String policy_type) {
        this.policy_type = policy_type;
    }

    public String getIncident() {
        return incident;
    }

    public void setIncident(String incident) {
        this.incident = incident;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoPassangers() {
        return noPassangers;
    }

    public void setNoPassangers(String noPassangers) {
        this.noPassangers = noPassangers;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    
}

package com.nationwide.co.uk.beans;

import java.util.ArrayList;
import java.util.List;

public class InvolvedPartyRegistrationReply {
    String name;
    int accountId;
    String registrationNumber;
    String registrationStatus;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getRegistrationStatus() {
        return registrationStatus;
    }
    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

}

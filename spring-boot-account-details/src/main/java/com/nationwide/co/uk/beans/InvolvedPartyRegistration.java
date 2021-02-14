package com.nationwide.co.uk.beans;

import java.util.ArrayList;
import java.util.List;

public class InvolvedPartyRegistration {
    private List<InvolvedParty> involvedPartyRecords;

    private static InvolvedPartyRegistration stdregd = null;

    private InvolvedPartyRegistration(){
        involvedPartyRecords = new ArrayList<InvolvedParty>();
    }

    public static InvolvedPartyRegistration getInstance() {

        if(stdregd == null) {
            stdregd = new InvolvedPartyRegistration();
            return stdregd;
        }
        else {
            return stdregd;
        }
    }

    public void add(InvolvedParty std) {
        involvedPartyRecords.add(std);
    }

    public String upDateStudent(InvolvedParty std) {

        for(int i=0; i<involvedPartyRecords.size(); i++)
        {
            InvolvedParty stdn = involvedPartyRecords.get(i);
            System.out.println(stdn.getRegistrationNumber());
            System.out.println(std.getRegistrationNumber());
            if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
                involvedPartyRecords.set(i, std);//update the new record
                return "Update successful";
            }
        }

        return "Update un-successful";

    }

    public String deleteStudent(String registrationNumber) {

        for(int i=0; i<involvedPartyRecords.size(); i++)
        {
            InvolvedParty stdn = involvedPartyRecords.get(i);
            if(stdn.getRegistrationNumber().equals(registrationNumber)) {
                involvedPartyRecords.remove(i);//update the new record
                return "Delete successful";
            }
        }

        return "Delete un-successful";

    }

    public List<InvolvedParty> getinvolvedPartyRecords() {
        return involvedPartyRecords;
    }

}



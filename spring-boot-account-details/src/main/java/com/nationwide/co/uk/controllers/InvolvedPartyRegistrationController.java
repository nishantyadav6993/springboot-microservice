package com.nationwide.co.uk.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nationwide.co.uk.beans.*;

@Controller
public class InvolvedPartyRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value="/register/involvedParty")


    @ResponseBody
    InvolvedPartyRegistrationReply registerStudent(@RequestBody InvolvedParty involvedParty) {

        System.out.println("In registerStudent");
        InvolvedPartyRegistrationReply stdregreply = new InvolvedPartyRegistrationReply();

        InvolvedPartyRegistration.getInstance().add(involvedParty);

        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(involvedParty.getName());
        stdregreply.setAccountId(involvedParty.getAccountId());
        stdregreply.setRegistrationNumber(involvedParty.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");


        return stdregreply;

    }

}

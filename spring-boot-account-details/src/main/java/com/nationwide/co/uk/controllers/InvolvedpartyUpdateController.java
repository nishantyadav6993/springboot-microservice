package com.nationwide.co.uk.controllers;

import com.nationwide.co.uk.beans.InvolvedParty;
import com.nationwide.co.uk.beans.InvolvedPartyRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nationwide.co.uk.beans.InvolvedParty;
import com.nationwide.co.uk.beans.InvolvedPartyRegistration;

@Controller
public class InvolvedpartyUpdateController {

    @RequestMapping(method = RequestMethod.PUT, value="/update/involvedParty")


    @ResponseBody
    public String updateStudentRecord(@RequestBody InvolvedParty stdn) {
        System.out.println("In updateStudentRecord");
        return InvolvedPartyRegistration.getInstance().upDateStudent(stdn);
    }

}


package com.nationwide.co.uk.controllers;

import com.nationwide.co.uk.beans.InvolvedPartyRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InvolvedPartyDeleteController {
    @RequestMapping(method = RequestMethod.DELETE, value="/delete/involvedParty/{regdNum}")

    @ResponseBody
    public String deleteInvolvedPartyRecord(@PathVariable("regdNum") String regdNum) {
        System.out.println("In deleteInvolvedPartyRecord");
        return InvolvedPartyRegistration.getInstance().deleteStudent(regdNum);
    }
}





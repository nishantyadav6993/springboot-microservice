package com.nationwide.co.uk.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nationwide.co.uk.beans.InvolvedParty;
import com.nationwide.co.uk.beans.InvolvedPartyRegistration;

@Controller
public class InvolvedPartyRetrieveController {

    @RequestMapping(method = RequestMethod.GET, value="/involvedParty/allinvolvedParty")

    @ResponseBody
    public List<InvolvedParty> getStudent() {
        return InvolvedPartyRegistration.getInstance().getinvolvedPartyRecords();
    }

}


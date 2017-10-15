package ru.atom.yes_no.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.atom.yes_no.model.YesNo;

/**
 * Created by Fella on 15.10.2017.
 */
@Controller
public class YesNoController {

    @Autowired
    YesNo yesNo;

    @RequestMapping("/")
    @ResponseBody
    public String predict(){
        return  yesNo.tall();
    }


}

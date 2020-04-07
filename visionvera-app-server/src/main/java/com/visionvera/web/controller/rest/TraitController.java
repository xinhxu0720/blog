package com.visionvera.web.controller.rest;

import com.visionvera.service.TraitService;
import com.visionvera.vo.Trait;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Trait")
public class TraitController {

    @Resource
    TraitService traitService;

    @RequestMapping("/querAll")
    @ResponseBody
    public List<Trait> querAll(HttpServletRequest request){
        List<Trait> traits = traitService.querAll();
        request.setAttribute("traits",traits);
        return traits;
    }
}

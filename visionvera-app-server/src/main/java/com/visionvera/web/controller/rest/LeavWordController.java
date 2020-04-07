package com.visionvera.web.controller.rest;

import com.visionvera.service.LeavWordService;
import com.visionvera.vo.LeavWord;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Controller
@RequestMapping("/leavword")
public class LeavWordController {

    @Resource
    LeavWordService leavWordService;

    @RequestMapping("/add")
    public Object add(String name,String email,String phone,String comments){
        LeavWord le = new LeavWord();
        le.setCreateDate(new Date());
        le.setName(name);
        le.setEmail(email);
        le.setPhone(phone);
        le.setComments(comments);
        int insert = leavWordService.insert(le);
        return new ModelAndView("redirect:/find/index.do");
    }

    @RequestMapping("/testHttpMessageDown")
    public  Object download(HttpServletRequest request) throws IOException {
        File file = new File("/sofwate/imgs/t.exe");
        byte[] body = null;
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }

    @RequestMapping("/wenjianHttpMessageDown")
    public  Object wenjiandownload(HttpServletRequest request) throws IOException {
        File file = new File("/sofwate/imgs/1.pdf");
        byte[] body = null;
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }
}

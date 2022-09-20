package com.valentin.beer.Controller;

import com.valentin.beer.Bean.PubBean;
import com.valentin.beer.Service.PubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pub")
@CrossOrigin(origins = "http://localhost:4040", allowedHeaders = "*")
public class PubController {

    @Autowired
    PubService pubService;

    @GetMapping(path = "/all")
    public List<PubBean> getAllPub(){
        return pubService.getAllPub();
    }
}

package com.valentin.beer.Controller;

import com.valentin.beer.Bean.BeerBeen;
import com.valentin.beer.Service.BeerService;
import com.valentin.beer.Service.BeerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/beer")
public class BeerController {

    @Autowired
    BeerServiceImpl beerService;

    @GetMapping(path = "/all")
    public List<BeerBeen> getAllBeer() {
        return beerService.getAllBeer();
    }
}

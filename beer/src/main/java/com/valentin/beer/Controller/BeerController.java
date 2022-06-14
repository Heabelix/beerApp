package com.valentin.beer.Controller;

import com.valentin.beer.Bean.BeerBean;
import com.valentin.beer.Service.BeerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/beer")
public class BeerController {

    @Autowired
    BeerServiceImpl beerService;

    @GetMapping(path = "/all")
    public List<BeerBean> getAllBeer() {
        return beerService.getAllBeer();
    }

    @PostMapping(path = "/add")
    public void addBeer(@RequestParam BeerBean beerBean) {
         beerService.addBeer(beerBean);
    }
}

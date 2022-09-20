package com.valentin.beer.Controller;

import com.valentin.beer.Bean.BeerBean;
import com.valentin.beer.Service.BeerService;
import com.valentin.beer.Service.BeerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4040", allowedHeaders = "*")
@RequestMapping(path = "/beer")
public class BeerController {

    @Autowired
    BeerService beerService;

    @GetMapping(path = "/all")
    public List<BeerBean> getAllBeer() {
        return beerService.getAllBeer();
    }

    @GetMapping(path = "/color/{color}")
    public List<BeerBean> getBeerByColor(@PathVariable final String color) {
        return beerService.getBeerByColor(color);
    }

    @GetMapping(path = "/brasserie/{brasserie}")
    public List<BeerBean> getBeerByBrasserie(@PathVariable final String brasserie) {
        return beerService.getBeerByBrasserie(brasserie);
    }

    @PostMapping(path = "/add")
    public BeerBean addBeer(@RequestBody final BeerBean beer) {
        return beerService.addBeer(beer);
    }
}
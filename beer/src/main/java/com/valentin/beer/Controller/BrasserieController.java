package com.valentin.beer.Controller;

import com.valentin.beer.Bean.BrasserieBean;
import com.valentin.beer.Service.BrasserieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/brasserie")
public class BrasserieController {

    @Autowired
    BrasserieService brasserieService;

    @GetMapping(path = "/all")
    public List<BrasserieBean> getAllBrasserie() {
        return brasserieService.getAllBrasserie();
    }

    @PostMapping(path = "/add")
    public BrasserieBean addBrasserie(@RequestBody final BrasserieBean brasserieBean) {
        return brasserieService.addBrasserie(brasserieBean);
    }
}

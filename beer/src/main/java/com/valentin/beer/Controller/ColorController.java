package com.valentin.beer.Controller;

import com.valentin.beer.Bean.ColorBean;
import com.valentin.beer.Service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/color")
public class ColorController {

    @Autowired
    ColorService colorService;

    @GetMapping(path = "/all")
    public List<ColorBean> getAllColors() {
        return colorService.getAllColor();
    }

    @PostMapping(path = "/add")
    public ColorBean addColor(@RequestBody final ColorBean color) {
        return colorService.addColor(color);
    }
}

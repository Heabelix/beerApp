package com.valentin.beer.Service;

import com.valentin.beer.Bean.ColorBean;
import com.valentin.beer.Repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService{

    @Autowired
    ColorRepository colorRepository;

    @Override
    public List<ColorBean> getAllColor() {
        return colorRepository.findAll();
    }

    @Override
    public ColorBean addColor(final ColorBean color) {
        return colorRepository.save(color);
    }
}

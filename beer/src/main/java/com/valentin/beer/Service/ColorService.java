package com.valentin.beer.Service;

import com.valentin.beer.Bean.ColorBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ColorService {
    List<ColorBean> getAllColor();

    ColorBean addColor(ColorBean color);
}

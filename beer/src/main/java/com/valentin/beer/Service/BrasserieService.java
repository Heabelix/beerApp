package com.valentin.beer.Service;

import com.valentin.beer.Bean.BrasserieBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrasserieService {
    List<BrasserieBean> getAllBrasserie();

    BrasserieBean addBrasserie(BrasserieBean brasserieBean);
}

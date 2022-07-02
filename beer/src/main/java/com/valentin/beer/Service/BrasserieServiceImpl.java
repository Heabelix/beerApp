package com.valentin.beer.Service;

import com.valentin.beer.Bean.BrasserieBean;
import com.valentin.beer.Repository.BrasserieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrasserieServiceImpl implements BrasserieService{

    @Autowired
    BrasserieRepository brasserieRepository;

    @Override
    public List<BrasserieBean> getAllBrasserie() {
        return brasserieRepository.findAll();
    }

    @Override
    public BrasserieBean addBrasserie(BrasserieBean brasserieBean) {
        return brasserieRepository.save(brasserieBean);
    }
}

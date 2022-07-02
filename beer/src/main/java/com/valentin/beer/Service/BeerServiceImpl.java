package com.valentin.beer.Service;

import com.valentin.beer.Bean.BeerBean;
import com.valentin.beer.Repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {
    @Autowired
    BeerRepository beerRepository;

    public List<BeerBean> getAllBeer() {
        return beerRepository.findAll();
    }

    public List<BeerBean> getBeerByColor(String color) {
        return beerRepository.findBeerBeanByColor_ColorName(color);
    }

    public List<BeerBean> getBeerByBrasserie(String brasserie) {
        return beerRepository.findBeerBeansByBrasserieName_BrasserieName(brasserie);
    }

    public BeerBean addBeer(final BeerBean beer) {
        return beerRepository.save(beer);
    }
}

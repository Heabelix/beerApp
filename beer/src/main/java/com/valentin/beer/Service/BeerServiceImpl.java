package com.valentin.beer.Service;

import com.valentin.beer.Bean.BeerBeen;
import com.valentin.beer.Repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {
    @Autowired
    BeerRepository beerRepository;

    public List<BeerBeen> getAllBeer() {
        return beerRepository.getAllBeer();
    }
}

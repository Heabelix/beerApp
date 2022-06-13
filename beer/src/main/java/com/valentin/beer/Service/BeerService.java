package com.valentin.beer.Service;

import com.valentin.beer.Bean.BeerBeen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BeerService {

    public List<BeerBeen> getAllBeer();
}
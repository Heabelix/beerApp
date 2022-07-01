package com.valentin.beer.Repository;

import com.valentin.beer.Bean.BeerBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends CrudRepository<BeerBean, Integer> {


    List<BeerBean> findAll();

    List<BeerBean> findBeerBeanByColor_ColorName(String color);
}

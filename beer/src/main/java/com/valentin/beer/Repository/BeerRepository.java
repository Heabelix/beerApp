package com.valentin.beer.Repository;

import com.valentin.beer.Bean.BeerBeen;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends CrudRepository<BeerBeen, Integer> {

    @Query(nativeQuery = true, value = "select id_beer, name, color_name from beer left join color c on beer.color_id = c.id_color;")
    List<BeerBeen> getAllBeer();
}

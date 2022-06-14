package com.valentin.beer.Repository;

import com.valentin.beer.Bean.BeerBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends CrudRepository<BeerBean, Integer> {

    @Query(nativeQuery = true, value = "select id_beer, name, color_name, name_brasserie from beer left join color c on beer.color_id = c.id_color  left join brasserie b on beer.id_brasserie = b.id_brasserie;")
    List<BeerBean> getAllBeer();


}

package com.valentin.beer.Repository;

import com.valentin.beer.Bean.BrasserieBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrasserieRepository extends CrudRepository<BrasserieBean, Integer> {

    List<BrasserieBean> findAll();
}

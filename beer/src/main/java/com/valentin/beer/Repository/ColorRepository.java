package com.valentin.beer.Repository;

import com.valentin.beer.Bean.ColorBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorRepository extends CrudRepository<ColorBean, Integer> {

    List<ColorBean> findAll();
}

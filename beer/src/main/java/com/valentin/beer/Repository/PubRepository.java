package com.valentin.beer.Repository;

import com.valentin.beer.Bean.PubBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface PubRepository  extends CrudRepository<PubBean, Integer> {

    List<PubBean> findAll();
}

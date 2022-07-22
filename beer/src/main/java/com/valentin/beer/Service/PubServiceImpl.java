package com.valentin.beer.Service;

import com.valentin.beer.Bean.PubBean;
import com.valentin.beer.Repository.PubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PubServiceImpl implements PubService {

    @Autowired
    PubRepository pubRepository;

    @Override
    public List<PubBean> getAllPub() {
        return pubRepository.findAll();
    }
}

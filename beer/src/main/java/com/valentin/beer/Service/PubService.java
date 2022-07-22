package com.valentin.beer.Service;

import com.valentin.beer.Bean.PubBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PubService {
    List<PubBean> getAllPub();
}

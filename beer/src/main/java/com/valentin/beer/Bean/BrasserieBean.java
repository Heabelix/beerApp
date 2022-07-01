package com.valentin.beer.Bean;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
@Table(name = "brasserie")
public class BrasserieBean {

    @Id
    @GeneratedValue
    @Column(name = "id_brasserie")
    Integer brasserieId;

    @Column(name = "name_brasserie")
    String brasserieName;

//    @OneToMany
//    @JoinColumn(name = "id_brasserie")
//    Collection<BeerBean> beerBeans;
}

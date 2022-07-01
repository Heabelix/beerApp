package com.valentin.beer.Bean;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
@Table(name = "beer")
public class BeerBean {

    @Id
    @Column(name = "id_beer")
    @GeneratedValue
    Integer id;


    String name;


    @OneToOne
    @JoinColumn(name = "color_id")
    ColorBean color;


    @ManyToOne
    @JoinColumn(name = "id_brasserie")
    BrasserieBean brasserieName;
}

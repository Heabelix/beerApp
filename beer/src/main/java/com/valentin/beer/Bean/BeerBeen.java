package com.valentin.beer.Bean;



import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
public class BeerBeen {

    @Id
    @Column(name = "id_beer")
    Integer id;


    String name;

    @Column(name = "color_name")
    String color;

    @Column(name = "name_brasserie")
    String brasserieName;
}

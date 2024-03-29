package com.valentin.beer.Bean;


import com.fasterxml.jackson.annotation.*;
import com.valentin.beer.json.JsonViewPub;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
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


    @ManyToMany(mappedBy = "beersInPub",fetch = FetchType.LAZY)
    List<PubBean> pubWithBeer;
}

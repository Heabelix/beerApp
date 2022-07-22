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
@Table(name = "pub")
public class PubBean {

    @Id
    @Column(name = "id_pub")
    Integer id;

    @Column(name = "pub_name")
    String name;

    @Column
    String ville;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "beer_pub", joinColumns = @JoinColumn(name = "pub_id"), inverseJoinColumns =  @JoinColumn(name = "beer_id"))
    List<BeerBean> beersInPub;

}

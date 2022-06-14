package com.valentin.beer.Bean;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
public class BrasserieBean {

    @Id
    @GeneratedValue
    @Column(name = "id_brasserie")
    Integer brasserieId;

    @Column(name = "name_brasserie")
    String brasserieName;
}

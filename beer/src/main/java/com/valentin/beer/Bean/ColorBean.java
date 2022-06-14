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
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PROTECTED)
public class ColorBean {

    @Id
    @Column(name = "id_color")
    @GeneratedValue
    Integer colorId;

    @Column(name = "color_name")
    String colorName;
}

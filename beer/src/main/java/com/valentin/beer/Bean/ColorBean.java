package com.valentin.beer.Bean;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PROTECTED)
@Embeddable
@Table(name = "color")
public class ColorBean {

    @Id
    @Column(name = "id_color")
    @GeneratedValue
    Integer colorId;

    @Column(name = "color_name")
    String colorName;
}

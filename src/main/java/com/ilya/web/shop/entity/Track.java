package com.ilya.web.shop.entity;

import com.ilya.web.shop.entity.api.Identifible;
import com.ilya.web.shop.entity.enums.TrackCategory;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="track")
public class Track implements Identifible {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private TrackCategory category;

    
}

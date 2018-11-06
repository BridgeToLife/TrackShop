package com.ilya.web.shop.entity;

import com.ilya.web.shop.entity.api.Identifible;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Entity
@Table(name = "order")
public class Order implements Identifible {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "track_id")
    private Track track;

    public Order(){

    }

    public Order(long id, String name, User user, Track track, int price){
        this.id = id;
        this.name = name;
        this.track = track;
        this.user = user;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Track getTrack() {
        return track;
    }

    public User getUser() {
        return user;
    }


}

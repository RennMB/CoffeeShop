package com.example.CoffeeShop.model;

import javax.persistence.*;

@Entity
@Table(name = "item_1")

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = true)
    private String description;
    @Column(name = "weight", nullable = true)
    private String weight;
    @Column(name = "price", nullable = false)
    private Double price;
    @Column(name = "picture", nullable = true)
    private String picture;
    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private Category category;
    @Column(name = "discount", nullable = true)
    private Double discount;

    public Item() {
    }

    public Item(String name, String description, String weight, Double price, String picture, Category category, Double discount) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.picture = picture;
        this.category = category;
        this.discount = discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }


}

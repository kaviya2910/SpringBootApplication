package com.learnSpringBoot.jobPortal;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;


@Entity
@Table(name="company")
public class entityClass {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;

    @Column(name="name",nullable = false,unique = true,length = 10)
    String name;

    @Column(name="rating", precision = 3, scale = 2)
    BigDecimal rating;
    @Column(name="created_by",length = 10)
    String createdBy;

    @Column(name="created_at")
    Instant createdAt;

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

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}

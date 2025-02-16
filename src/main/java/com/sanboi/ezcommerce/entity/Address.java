package com.sanboi.ezcommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "line1", nullable = false, length = 100)
    private String line1;

    @Column(name = "line2", length = 100)
    private String line2;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "state", length = 50, nullable = false)
    private String state;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @OneToOne(mappedBy = "address")
    private User user;
    @OneToOne(mappedBy = "address")
    private Supplier supplier;
}

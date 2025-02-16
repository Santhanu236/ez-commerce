package com.sanboi.ezcommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity()
@Table(name = "users")
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "fname", length = 50, nullable = false)
    private String fname;

    @Column(name = "lname", length = 50)
    private String lname;

    @Column(name = "email", length = 62, unique = true, nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column(name = "phone", length = 10, unique = true, nullable = false)
    private long phone;

}

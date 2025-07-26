package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "TOURIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;
    
    private Double budget;
}

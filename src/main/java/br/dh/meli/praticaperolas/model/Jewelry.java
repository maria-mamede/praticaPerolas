package br.dh.meli.praticaperolas.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Jewelry {
    @Id
    @GeneratedValue
    private Long idNumber;

    @Column
    private String material;

    @Column
    private double weight;

    @Column
    private int carat;
}

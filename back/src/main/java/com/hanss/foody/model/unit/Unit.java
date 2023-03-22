package com.hanss.foody.model.unit;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
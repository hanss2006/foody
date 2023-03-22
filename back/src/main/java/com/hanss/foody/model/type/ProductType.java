package com.hanss.foody.model.type;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String iconUrl;
}
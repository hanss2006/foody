package com.hanss.foody.domain.product;
import com.hanss.foody.domain.type.ProductType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer calories;
    private Float proteins;
    private Float fats;
    private Float carbohydrates;

    @Column(name = "PRODUCT_TYPE_ID")
    private Long productTypeId;
    @ManyToOne
    @JoinColumn(name = "PRODUCT_TYPE_ID", insertable = false, updatable = false)
    private ProductType productType;
}

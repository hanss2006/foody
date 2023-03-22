package com.hanss.foody.model.product;
import com.hanss.foody.model.type.ProductType;
import lombok.Data;
import jakarta.persistence.*;

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

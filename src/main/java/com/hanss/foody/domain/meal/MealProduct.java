package com.hanss.foody.domain.meal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hanss.foody.domain.product.Product;
import com.hanss.foody.domain.unit.Unit;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "MEAL_PRODUCT")
public class MealProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "MEAL_ID")
    @JsonProperty("mealId")
    private Long mealId;
    @ManyToOne
    @JoinColumn(name = "MEAL_ID", insertable = false, updatable = false)
    @RestResource(path = "meal", rel="meal")
    private Meal meal;

    @Column(name = "PRODUCT_ID")
    @JsonProperty("productId")
    private Long productId;
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", insertable = false, updatable = false)
    @RestResource(path = "product", rel="product")
    private Product product;

    private Float quantity;

    @Column(name = "UNIT_ID")
    private Long unitId;
    @ManyToOne
    @JoinColumn(name = "UNIT_ID", insertable = false, updatable = false)
    @RestResource(path = "unit", rel="unit")
    private Unit unit;
}

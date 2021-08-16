package com.hanss.foody.domain.meal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hanss.foody.domain.unit.Unit;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@IdClass(MealProductPK.class)
@Table(name = "MEAL_PRODUCT")
public class MealProduct implements Serializable {
/*
    @EmbeddedId
    private MealProductPK mealProductPK;
*/

    @Id
    @Column(name = "MEAL_ID")
    @JsonProperty("mealId")
    private Long mealId;

    @Id
    @Column(name = "PRODUCT_ID")
    @JsonProperty("productId")
    private Long productId;

    private Float quantity;

    @Column(name = "UNIT_ID")
    private Long unitId;
    @ManyToOne
    @JoinColumn(name = "UNIT_ID", insertable = false, updatable = false)
    private Unit unit;
}

package com.hanss.foody.domain.meal;

import com.hanss.foody.domain.unit.Unit;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "MEAL_PRODUCT")
public class MealProduct implements Serializable {
    @EmbeddedId
    private MealProductPK mealProductPK;

    private Float quantity;

    @Column(name = "UNIT_ID")
    private Long unitId;
    @ManyToOne
    @JoinColumn(name = "UNIT_ID", insertable = false, updatable = false)
    private Unit unit;
}

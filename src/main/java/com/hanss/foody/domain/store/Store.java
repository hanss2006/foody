package com.hanss.foody.domain.store;

import com.hanss.foody.domain.meal.Meal;
import com.hanss.foody.domain.type.ProductType;
import com.hanss.foody.domain.unit.Unit;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long mealId;
    @ManyToOne
    @JoinColumn(name = "mealId", insertable = false, updatable = false)
    private Meal meal;

    private Float quantity;

    private Long unitId;
    @ManyToOne
    @JoinColumn(name = "unitId", insertable = false, updatable = false)
    private Unit unit;
}

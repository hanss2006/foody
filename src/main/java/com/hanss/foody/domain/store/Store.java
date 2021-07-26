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

    @Column(name = "MEAL_ID")
    private Long mealId;
    @ManyToOne
    @JoinColumn(name = "MEAL_ID", insertable = false, updatable = false)
    private Meal meal;

    private Float quantity;

    @Column(name = "UNIT_ID")
    private Long unitId;
    @ManyToOne
    @JoinColumn(name = "UNIT_ID", insertable = false, updatable = false)
    private Unit unit;
}

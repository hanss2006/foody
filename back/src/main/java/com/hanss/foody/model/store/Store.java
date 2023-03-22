package com.hanss.foody.model.store;

import com.hanss.foody.model.meal.Meal;
import com.hanss.foody.model.unit.Unit;
import lombok.Data;
import jakarta.persistence.*;

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

package com.hanss.foody.domain.meal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MealProductPK implements Serializable {
    @Column(name = "MEAL_ID")
    private Long mealId;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    public MealProductPK() {
    }

    public MealProductPK(Long mealId, Long productId) {
        this.mealId = mealId;
        this.productId = productId;
    }

    public Long getMealId() {
        return mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MealProductPK)) return false;
        MealProductPK that = (MealProductPK) o;
        return getMealId().equals(that.getMealId()) && getProductId().equals(that.getProductId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMealId(), getProductId());
    }
}

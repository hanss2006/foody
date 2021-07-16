package com.hanss.foody.domain.meal;

import com.hanss.foody.domain.product.Product;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer calories;
    private Float proteins;
    private Float fats;
    private Float carbohydrates;

    @ManyToMany
    @JoinTable(
            name = "meal_product",
            joinColumns = @JoinColumn(
                    name = "meal_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "profuct_id", referencedColumnName = "id"))
    private Set<Product> products;
    private String iconUrl;

    @Lob
    private String recipe;

    private Boolean enabled;

}
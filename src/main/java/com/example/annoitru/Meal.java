package com.example.annoitru;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Entity
@Table(name = "Meals")
public class Meal {
    @Id
    @Nationalized
    @Column(name = "id", nullable = false, length = 10)
    private String id;

    @Nationalized
    @Column(name = "name", length = 100)
    private String name;

    @Nationalized
    @Lob
    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kitchen_employee_id")
    private KitchenEmployee kitchenEmployee;

    @Column(name = "meal_date")
    private LocalDate mealDate;

    @ColumnDefault("0")
    @Column(name = "so_luong_an")
    private Integer soLuongAn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KitchenEmployee getKitchenEmployee() {
        return kitchenEmployee;
    }

    public void setKitchenEmployee(KitchenEmployee kitchenEmployee) {
        this.kitchenEmployee = kitchenEmployee;
    }

    public LocalDate getMealDate() {
        return mealDate;
    }

    public void setMealDate(LocalDate mealDate) {
        this.mealDate = mealDate;
    }

    public Integer getSoLuongAn() {
        return soLuongAn;
    }

    public void setSoLuongAn(Integer soLuongAn) {
        this.soLuongAn = soLuongAn;
    }

}
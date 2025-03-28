package com.SENA.Inventario.MODEL;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Category", length = 10)
    private int id_Category;

    @Column(name = "Description", length = 70)
    private String Description;

    public Category() {
    }

    public Category(int id_Category, String description) {
        this.id_Category = id_Category;
        Description = description;
    }

    public int getId_Category() {
        return id_Category;
    }

    public void setId_Category(int id_Category) {
        this.id_Category = id_Category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}

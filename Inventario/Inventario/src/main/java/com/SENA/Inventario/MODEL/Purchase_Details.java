package com.SENA.Inventario.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Purchase_Details")
public class Purchase_Details {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Purchase_Details", length = 10)
    private int id_Category;

    @Column(name = "Quantity", length = 70)
    private String Quantity;

    @Column(name = "Price_Unit", length = 70)
    private String Price_Unit;

    @Column(name = "Subtotal", length = 70)
    private String Subtotal;

    public Purchase_Details() {
    }

    public Purchase_Details(int id_Category, String quantity, String price_Unit, String subtotal) {
        this.id_Category = id_Category;
        Quantity = quantity;
        Price_Unit = price_Unit;
        Subtotal = subtotal;
    }

    public int getId_Category() {
        return id_Category;
    }

    public void setId_Category(int id_Category) {
        this.id_Category = id_Category;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getPrice_Unit() {
        return Price_Unit;
    }

    public void setPrice_Unit(String price_Unit) {
        Price_Unit = price_Unit;
    }

    public String getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(String subtotal) {
        Subtotal = subtotal;
    }

    
}

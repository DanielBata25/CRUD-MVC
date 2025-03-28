package com.SENA.Inventario.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Batch")
public class Batch {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Batch", length = 10)
    private int Batch;

    @Column(name = "Production_Date", length = 70)
    private String Production_Date;

    @Column(name = "Expiration_Date", length = 70)
    private String Expiration_Date;

    @Column(name = "Quantity_Nicial", length = 70)
    private String Quantity_Nicial;

    @Column(name = "Current_Quantity", length = 70)
    private String Current_Quantity;

    public Batch() {
    }

    public Batch(int batch, String production_Date, String expiration_Date, String quantity_Nicial,
            String current_Quantity) {
        Batch = batch;
        Production_Date = production_Date;
        Expiration_Date = expiration_Date;
        Quantity_Nicial = quantity_Nicial;
        Current_Quantity = current_Quantity;
    }

    public int getBatch() {
        return Batch;
    }

    public void setBatch(int batch) {
        Batch = batch;
    }

    public String getProduction_Date() {
        return Production_Date;
    }

    public void setProduction_Date(String production_Date) {
        Production_Date = production_Date;
    }

    public String getExpiration_Date() {
        return Expiration_Date;
    }

    public void setExpiration_Date(String expiration_Date) {
        Expiration_Date = expiration_Date;
    }

    public String getQuantity_Nicial() {
        return Quantity_Nicial;
    }

    public void setQuantity_Nicial(String quantity_Nicial) {
        Quantity_Nicial = quantity_Nicial;
    }

    public String getCurrent_Quantity() {
        return Current_Quantity;
    }

    public void setCurrent_Quantity(String current_Quantity) {
        Current_Quantity = current_Quantity;
    }

    

}

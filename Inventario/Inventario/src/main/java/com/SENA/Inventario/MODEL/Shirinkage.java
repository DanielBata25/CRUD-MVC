package com.SENA.Inventario.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Batch")
public class Shirinkage {

        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Batch", length = 10)
    private int Batch;

    @Column(name = "Quantity", length = 70)
    private String Quantity;

    @Column(name = "Record_Date", length = 70)
    private String Record_Date;

    @Column(name = "Reason", length = 70)
    private String Reason;

    @Column(name = "Responsible_Party", length = 70)
    private String Responsible_party;

    public Shirinkage() {
    }

    public Shirinkage(int batch, String quantity, String record_Date, String reason, String responsible_party) {
        Batch = batch;
        Quantity = quantity;
        Record_Date = record_Date;
        Reason = reason;
        Responsible_party = responsible_party;
    }

    public int getBatch() {
        return Batch;
    }

    public void setBatch(int batch) {
        Batch = batch;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getRecord_Date() {
        return Record_Date;
    }

    public void setRecord_Date(String record_Date) {
        Record_Date = record_Date;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getResponsible_party() {
        return Responsible_party;
    }

    public void setResponsible_party(String responsible_party) {
        Responsible_party = responsible_party;
    }

    

}

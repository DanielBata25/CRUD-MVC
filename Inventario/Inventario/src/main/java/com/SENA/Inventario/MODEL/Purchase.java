package com.SENA.Inventario.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Purchase")
public class Purchase {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Purchase", length = 10)
    private int id_Purchase;

    @Column(name = "Record_Purchase", length = 70)
    private String Record_Purchase;

    @Column(name = "Total_Amount", length = 70)
    private String Total_Amount;

    @Column(name = "Invoice_Number", length = 70)
    private String Invoice_Number;

    @Column(name = "Status", length = 70)
    private String Status;

    public Purchase() {
    }

    public Purchase(int id_Purchase, String record_Purchase, String total_Amount, String invoice_Number,
            String status) {
        this.id_Purchase = id_Purchase;
        Record_Purchase = record_Purchase;
        Total_Amount = total_Amount;
        Invoice_Number = invoice_Number;
        Status = status;
    }

    public int getId_Purchase() {
        return id_Purchase;
    }

    public void setId_Purchase(int id_Purchase) {
        this.id_Purchase = id_Purchase;
    }

    public String getRecord_Purchase() {
        return Record_Purchase;
    }

    public void setRecord_Purchase(String record_Purchase) {
        Record_Purchase = record_Purchase;
    }

    public String getTotal_Amount() {
        return Total_Amount;
    }

    public void setTotal_Amount(String total_Amount) {
        Total_Amount = total_Amount;
    }

    public String getInvoice_Number() {
        return Invoice_Number;
    }

    public void setInvoice_Number(String invoice_Number) {
        Invoice_Number = invoice_Number;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

}

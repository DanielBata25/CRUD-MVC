package com.SENA.Inventario.MODEL;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="Inventory_movement")
public class Inventory_movement {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    
    @Column(name = "Quantity", length = 30)
    private String Quantity;

    @Column(name = "Movement_date", length = 30)
    private String Movement_date;
    
    @Column(name = "Responsable_party", length = 30)
    private String Responsable_party;

    @Column(name = "Reason", length = 30)
    private String Reason;

    

     public Inventory_movement() {
     }

     public Inventory_movement(String quantity, String movement_date, String responsable_party, String reason,
            List<com.SENA.Inventario.MODEL.Product> product) {
        Quantity = quantity;
        Movement_date = movement_date;
        Responsable_party = responsable_party;
        Reason = reason;
        
     }

     public String getQuantity() {
         return Quantity;
     }

     public void setQuantity(String quantity) {
         Quantity = quantity;
     }

     public String getMovement_date() {
         return Movement_date;
     }

     public void setMovement_date(String movement_date) {
         Movement_date = movement_date;
     }

     public String getResponsable_party() {
         return Responsable_party;
     }

     public void setResponsable_party(String responsable_party) {
         Responsable_party = responsable_party;
     }

     public String getReason() {
         return Reason;
     }

     public void setReason(String reason) {
         Reason = reason;
     }

   

    
}

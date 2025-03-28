package com.SENA.Inventario.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Supplier", length = 10)
    private int id_Supplier;

    @Column(name = "Name", length = 70)
    private String Name;

    @Column(name = "Contact", length = 70)
    private String Contact;

    @Column(name = "Email", length = 70)
    private String Email;

    public Supplier() {
    }

    public Supplier(int id_Supplier, String name, String contact, String email) {
        this.id_Supplier = id_Supplier;
        Name = name;
        Contact = contact;
        Email = email;
    }

    public int getId_Supplier() {
        return id_Supplier;
    }

    public void setId_Supplier(int id_Supplier) {
        this.id_Supplier = id_Supplier;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    

}

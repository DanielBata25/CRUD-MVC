package com.SENA.Inventario.MODEL;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "Location")
public class Location {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Location", length = 10)
    private int id_location;

    @Column(name = "Aisle", length = 70)
    private String Aisle;

    @Column(name = "Shelf", length = 70)
    private String Shelf;

    @OneToMany(mappedBy = "Location")  // Eliminamos cascade
    private List<Product> Product;


    public Location() {
    }

    public Location(int id_location, int id_Warehouse, String aisle, String shelf) {
        this.id_location = id_location;
        Aisle = aisle;
        Shelf = shelf;
    }

    public int getId_location() {
        return id_location;
    }

    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

    public String getAisle() {
        return Aisle;
    }

    public void setAisle(String aisle) {
        Aisle = aisle;
    }

    public String getShelf() {
        return Shelf;
    }

    public void setShelf(String shelf) {
        Shelf = shelf;
    }

}

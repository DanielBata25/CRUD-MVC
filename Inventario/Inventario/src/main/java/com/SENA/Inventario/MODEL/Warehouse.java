package com.SENA.Inventario.MODEL;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "Warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Warehouse", length = 10)
    private int id_Warehouse;

    @Column(name = "Name", length = 30)
    private String Name;

    @Column(name = "Type", length = 30)
    private String Type;

     @OneToMany(mappedBy = "warehouse")
    private List<Location> locations;
    
    public Warehouse() {
    }

    public Warehouse(int id_Warehouse, String name, String location, String type) {
        this.id_Warehouse = id_Warehouse;
        Name = name;
        
        Type = type;
    }

    public int getId_Warehouse() {
        return id_Warehouse;
    }

    public void setId_Warehouse(int id_Warehouse) {
        this.id_Warehouse = id_Warehouse;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

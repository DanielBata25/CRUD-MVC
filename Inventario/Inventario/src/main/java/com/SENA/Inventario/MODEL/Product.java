package com.SENA.Inventario.MODEL;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "Product")
public class Product {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column inidica que el valor es una columna es la tabla
    @Column(name = "id_Produt", length = 10)
    private int id_location;

    @Column(name = "id_Location", length = 10)
    private int id_Warehouse;

    @Column(name = "Name", length = 70)
    private String Name;

    @Column(name = "Description", length = 70)
    private String Description;

   @Column(name = "Purchase_price", precision = 10, scale = 2)
   private BigDecimal purchase_price;

   @Column(name = "Sale_price", precision = 10, scale = 2)
   private BigDecimal Sale_price;

   @Column(name = "fecha_pedido")
    private LocalDateTime fechaPedido;

    @Column(name = "Status")
    private Boolean Status; // Puede ser true, false o null

   public Product() {
    }

   @OneToMany(mappedBy = "Product") 
    private List<Inventory_movement> Inventory_movement;

   public Product(int id_location, int id_Warehouse, String name, String description, BigDecimal purchase_price,
        BigDecimal sale_price, LocalDateTime fechaPedido, Boolean status,
        List<com.SENA.Inventario.MODEL.Inventory_movement> inventory_movement) {
    this.id_location = id_location;
    this.id_Warehouse = id_Warehouse;
    Name = name;
    Description = description;
    this.purchase_price = purchase_price;
    Sale_price = sale_price;
    this.fechaPedido = fechaPedido;
    Status = status;
    Inventory_movement = inventory_movement;
   }

   public int getId_location() {
    return id_location;
   }

   public void setId_location(int id_location) {
    this.id_location = id_location;
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

   public String getDescription() {
    return Description;
   }

   public void setDescription(String description) {
    Description = description;
   }

   public BigDecimal getPurchase_price() {
    return purchase_price;
   }

   public void setPurchase_price(BigDecimal purchase_price) {
    this.purchase_price = purchase_price;
   }

   public BigDecimal getSale_price() {
    return Sale_price;
   }

   public void setSale_price(BigDecimal sale_price) {
    Sale_price = sale_price;
   }

   public LocalDateTime getFechaPedido() {
    return fechaPedido;
   }

   public void setFechaPedido(LocalDateTime fechaPedido) {
    this.fechaPedido = fechaPedido;
   }

   public Boolean getStatus() {
    return Status;
   }

   public void setStatus(Boolean status) {
    Status = status;
   }

   public List<Inventory_movement> getInventory_movement() {
    return Inventory_movement;
   }

   public void setInventory_movement(List<Inventory_movement> inventory_movement) {
    Inventory_movement = inventory_movement;
   }

}

package com.example.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {
    @Id @GeneratedValue
    private  long id;
    private String name;
    private  double price;
    private  double quantity;{}

    public long getProductoId() {
        return id; }
}

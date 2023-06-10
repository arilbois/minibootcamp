package com.example.inventoryservice.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Inventory {
    @Id
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}

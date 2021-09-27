package com.test.bk.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ITEM_TB")
public class Item {
    @Id
    @GeneratedValue
    private int itemId;
    private String itemName;
    private double unitPrice;
    private String unit;
    private int stock;
}

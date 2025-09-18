package com.mid.ecom_server.models;


import java.time.LocalDateTime;
import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mid.ecom_server.enums.OrderStatus;

@Document(collection="orders")
public class Order {
    @Id
    private String id;
    private String userId;

    private Map<String,Integer> products;
    private OrderStatus status;
    private Double totalAmount;
    private LocalDateTime creditedAt=LocalDateTime.now();

    public String getIid() {
        return id;
    }

    public void setIid(String iid) {
        this.id = iid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getCreditedAt() {
        return creditedAt;
    }

    public void setCreditedAt(LocalDateTime creditedAt) {
        this.creditedAt = creditedAt;
    }

}

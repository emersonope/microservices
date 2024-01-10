package br.com.analytics.customermetrics.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {

    private Long id;
    private String name;
    private String email;
    private BigDecimal debt;
}

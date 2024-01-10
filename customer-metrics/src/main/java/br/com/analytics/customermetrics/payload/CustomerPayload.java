package br.com.analytics.customermetrics.payload;

import lombok.Data;

import java.util.List;

@Data
public class CustomerPayload {

    private List<Long> customer;
}

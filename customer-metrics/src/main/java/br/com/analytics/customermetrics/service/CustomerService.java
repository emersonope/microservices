package br.com.analytics.customermetrics.service;

import br.com.analytics.customermetrics.model.User;
import br.com.analytics.customermetrics.repository.CustomerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerApiService customerApiService;

    public List<User> getAllCustomers(List<Long> ids) {
        return ids.stream().map(id -> customerApiService.getById(id)).toList();
    }
}

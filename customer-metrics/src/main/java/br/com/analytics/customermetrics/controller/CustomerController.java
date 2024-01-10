package br.com.analytics.customermetrics.controller;

import br.com.analytics.customermetrics.model.User;
import br.com.analytics.customermetrics.payload.CustomerPayload;
import br.com.analytics.customermetrics.repository.CustomerApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomerController {

    @Autowired
    CustomerApiService customerApiService;
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @PostMapping
    public void customerRegister(@RequestBody CustomerPayload customerPayload) {

            logger.info("Registering Customer: " + customerPayload);
            logger.info("Searching customer: ", customerPayload.getCustomer().get(0));
            User user = customerApiService.getById(customerPayload.getCustomer().get(0));
            logger.info("Customer: " + user);
    };
}
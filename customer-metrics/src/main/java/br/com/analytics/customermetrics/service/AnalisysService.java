//package br.com.profileAnalisys.apiprofileanalisys.service;
//
//import br.com.profileAnalisys.apiprofileanalisys.model.Customer;
//import br.com.profileAnalisys.apiprofileanalisys.repository.CustomerApiService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AnalisysService {
//
//    @Autowired
//    CustomerApiService customerApiService;
//
//    public List<Customer > getAllClients(List<Long> ids) {
//        return ids.stream().map(id -> customerApiService.getById(id)).toList();
//    }
//}

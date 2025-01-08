package com.example.car.feign;

import com.example.car.entities.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@org.springframework.cloud.openfeign.FeignClient(name = "SERVICE-CLIENT")
public interface FeignClient {
    @GetMapping("/clients")
    Client[] getAllClients();

    @GetMapping("/clients/{id}")
    Client getClientById(@PathVariable("id") Long id);
}

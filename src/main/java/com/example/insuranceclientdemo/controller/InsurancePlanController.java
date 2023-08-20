package com.example.insuranceclientdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InsurancePlanController {
@Autowired
@Lazy

private RestTemplate restTemplate;

  @Value("${insurance.provider.url}")
  private String url;


  @GetMapping("getNPlans")
  public List<String> getPlans(){

    return restTemplate.getForObject(url, List.class);
  }


  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }


}

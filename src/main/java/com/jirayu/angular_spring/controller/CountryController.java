package com.jirayu.angular_spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jirayu.angular_spring.entity.Country;
import com.jirayu.angular_spring.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @RequestMapping("/findAll")
    @CrossOrigin(origins = "*")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @RequestMapping("/save")
    @CrossOrigin(origins = "*")
    public Country save(@RequestBody Country country) {
        return countryService.save(country);
    }

    @GetMapping("/delete")
    @CrossOrigin(origins = "*")
    public void delete(Integer countryId) {
        countryService.delete(countryId);
    }

    @RequestMapping("/init")
    @CrossOrigin(origins = "*")
    public void initData() {
        List<Country> countryList = new ArrayList<Country>();

        Country country = new Country();
        country.setName("Thailand");
        country.setArea(513120);
        country.setPopulation(70000000);
        country.setFlags(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Flag_of_Thailand.svg/510px-Flag_of_Thailand.svg.png");
        countryList.add(country);

        Country country2 = new Country();
        country2.setName("japan");
        country2.setArea(513120);
        country2.setPopulation(70000000);
        country2.setFlags(
                "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/250px-Flag_of_Japan.svg.png");
        countryList.add(country2);

        countryService.saveAll(countryList);
    }
}

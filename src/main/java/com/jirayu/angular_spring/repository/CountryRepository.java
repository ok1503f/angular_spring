package com.jirayu.angular_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jirayu.angular_spring.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}

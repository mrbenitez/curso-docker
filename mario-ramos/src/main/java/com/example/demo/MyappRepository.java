package com.example.demo;

import com.example.demo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyappRepository extends JpaRepository<Person, Integer> {
}

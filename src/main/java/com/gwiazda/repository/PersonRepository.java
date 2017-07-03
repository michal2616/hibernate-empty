package com.gwiazda.repository;

import com.gwiazda.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by michal on 03.07.17.
 */

public interface PersonRepository extends JpaRepository<Person, Long> {



}

package com.rg.egen.repository;

import com.rg.egen.entity.Reading;
import com.rg.egen.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReadingsRepository extends CrudRepository<Reading, String> {

}

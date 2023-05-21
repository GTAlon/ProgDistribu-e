package com.example.javamysql;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface VehiculeRepository extends CrudRepository<Vehicule, Integer> {

    List<Vehicule> findByModele(String name);
    List<Vehicule> findById(Integer id);


}

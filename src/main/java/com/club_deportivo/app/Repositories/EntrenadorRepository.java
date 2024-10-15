package com.club_deportivo.app.Repositories;


import com.club_deportivo.app.Entities.Entrenador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends MongoRepository<Entrenador, String> {
}

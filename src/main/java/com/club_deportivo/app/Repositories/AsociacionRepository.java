package com.club_deportivo.app.Repositories;


import com.club_deportivo.app.Entities.Asociacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsociacionRepository extends MongoRepository<Asociacion, String> {
}

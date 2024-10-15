package com.club_deportivo.app.Repositories;

import com.club_deportivo.app.Entities.Club;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends MongoRepository<Club, String> {

}

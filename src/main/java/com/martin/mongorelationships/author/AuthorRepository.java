package com.martin.mongorelationships.author;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, Long> {

    @Query(value = "{'id': ?0}")
    Author findAuthorById(@Param("id") Long id);
}

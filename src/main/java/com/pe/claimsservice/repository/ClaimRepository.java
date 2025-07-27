package com.pe.claimsservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends ReactiveMongoRepository<Claim, String> {
}

package com.portal.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.entity.Candidate;
@Repository
public interface CandidateRepository extends JpaRepository <Candidate, Long> {

	//Candidate save(Candidate candidate);

}

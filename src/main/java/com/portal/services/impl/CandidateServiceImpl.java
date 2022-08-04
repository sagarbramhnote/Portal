package com.portal.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.Candidate;
import com.portal.repository.CandidateRepository;
import com.portal.services.CandidateService;
@Service
public class CandidateServiceImpl implements CandidateService{
@Autowired 
public CandidateRepository candidateRepository;
	
	@Override
	public Candidate saveCandidate(Candidate candidate) {
		candidateRepository.save(candidate);
 
		 return null;
	
	}
	@Override
	public List<Candidate> getAllCandidates() {
		
		return candidateRepository.findAll();
	}

	@Override
	public String deletecandidate(Long id) {
		
		candidateRepository.deleteById(id);
		return null;
	}

	@Override
	public Candidate updateCandidate(Candidate candidate, Long id) {
		Candidate oldcandidate=candidateRepository.findById(id).orElseThrow();
		
		
		
		
				candidateRepository.save(oldcandidate);
		return oldcandidate;
	    }
	



}

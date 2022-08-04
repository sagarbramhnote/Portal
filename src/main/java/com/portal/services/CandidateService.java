package com.portal.services;

import java.util.List;

import com.portal.entity.Candidate;

public interface CandidateService {
	
	public Candidate saveCandidate(Candidate candidate);
    public List<Candidate> getAllCandidates();
	public String deletecandidate(Long id);
	public Candidate updateCandidate(Candidate candidate, Long id);
	
	

}

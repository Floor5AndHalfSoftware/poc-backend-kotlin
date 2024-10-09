package com.poc.api.service.candidate.impl

import com.poc.api.controller.candidate.dto.request.CandidateRequestJson
import com.poc.api.persistance.candidate.repository.CandidateMapperRepository
import com.poc.api.service.candidate.CandidateService
import com.poc.api.service.candidate.mapper.CandidateMapper
import org.springframework.stereotype.Service

@Service
class CandidateServiceImpl(private var candidateMapperRepository: CandidateMapperRepository) : CandidateService {

    override fun create(candidate: CandidateRequestJson) {
        val candidateToSave = CandidateMapper.INSTANCE.recruiterRequestJsonToRecruiter(candidate);
        candidateMapperRepository.create(candidateToSave)

    }
}
package com.poc.api.service.candidate

import com.poc.api.controller.candidate.dto.request.CandidateRequestJson

interface CandidateService {
    fun create(candidate: CandidateRequestJson)
}
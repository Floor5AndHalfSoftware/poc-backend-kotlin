package com.poc.api.controller.candidate

import com.poc.api.controller.candidate.dto.request.CandidateRequestJson
import com.poc.api.service.candidate.CandidateService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/api/v1"])
class CandidateController {
    @Autowired
    private lateinit var candidateService: CandidateService

    @PostMapping("/candidates")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody candidate: CandidateRequestJson){
        candidateService.create(candidate)
    }
}
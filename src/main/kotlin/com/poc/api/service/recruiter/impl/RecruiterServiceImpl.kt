package com.poc.api.service.recruiter.impl

import com.poc.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.poc.api.controller.recruiter.dto.response.RecruiterResponseJson
import com.poc.api.persistance.recruiter.entity.Recruiter
import com.poc.api.persistance.recruiter.repository.RecruiterMapperRepository
import com.poc.api.service.recruiter.RecruiterService
import com.poc.api.service.recruiter.mapper.RecruiterMapper
import org.springframework.stereotype.Service

@Service
class RecruiterServiceImpl : RecruiterService {

    private lateinit var recruiterMapperRepository: RecruiterMapperRepository

    constructor(recruiterMapperRepository: RecruiterMapperRepository) {
        this.recruiterMapperRepository = recruiterMapperRepository
    }

    override fun findAll(): List<RecruiterResponseJson> {
        val recruiterList = recruiterMapperRepository.findAll()
        val recruiterMapped = recruiterList.map { recruiter: Recruiter -> RecruiterMapper.INSTANCE.recruiterToRecruiterResponseJson(recruiter) }
        return recruiterMapped
    }

    override fun create(recruiter: RecruiterRequestJson): RecruiterResponseJson {
        val recruiterMapped = RecruiterMapper.INSTANCE.recruiterRequestJsonToRecruiter(recruiter)
        recruiterMapperRepository.create(recruiterMapped)
        return RecruiterMapper.INSTANCE.recruiterToRecruiterResponseJson(recruiterMapped)
    }
}
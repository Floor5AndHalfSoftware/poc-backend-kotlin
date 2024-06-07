package com.poc.api.service.recruitment.impl

import com.poc.api.controller.dto.request.RecruiterRequestJson
import com.poc.api.controller.dto.response.RecruiterResponseJson
import com.poc.api.persistance.entity.Recruiter
import com.poc.api.persistance.repository.mybatis.RecruiterMapperRepository
import com.poc.api.service.recruitment.RecruiterService
import com.poc.api.service.recruitment.mapper.RecruiterMapper
import org.springframework.stereotype.Service

@Service
class RecruiterServiceImpl : RecruiterService {

    private lateinit var recruiterMapperRepository: RecruiterMapperRepository

    constructor(recruiterMapperRepository: RecruiterMapperRepository) {
        this.recruiterMapperRepository = recruiterMapperRepository
    }

    override fun findAll(): List<com.poc.api.controller.dto.response.RecruiterResponseJson> {
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
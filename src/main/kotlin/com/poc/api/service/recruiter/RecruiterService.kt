package com.poc.api.service.recruiter

import com.poc.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.poc.api.controller.recruiter.dto.response.RecruiterResponseJson

interface RecruiterService {
    fun findAll(): List<RecruiterResponseJson>
    fun create(recruiter: RecruiterRequestJson): RecruiterResponseJson
}
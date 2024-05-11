package com.poc.api.service.recruitment

import com.poc.api.controller.dto.response.RecruiterResponseJson

interface RecruiterService {
    fun findAll(): List<RecruiterResponseJson>
}
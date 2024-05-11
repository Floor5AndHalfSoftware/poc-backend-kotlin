package com.poc.api.service.recruitment.mapper

import com.poc.api.controller.dto.response.RecruiterResponseJson
import com.poc.api.persistance.entity.Recruiter
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.factory.Mappers

@Mapper
interface RecruiterMapper {

    companion object {
        val INSTANCE: RecruiterMapper = Mappers.getMapper(RecruiterMapper::class.java)
    }

    fun recruiterToRecruiterResponseJson(recruiter: Recruiter): RecruiterResponseJson

}

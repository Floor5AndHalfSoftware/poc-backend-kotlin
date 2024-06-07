package com.poc.api.service.recruitment.mapper

import com.poc.api.controller.dto.request.RecruiterRequestJson
import com.poc.api.controller.dto.response.RecruiterResponseJson
import com.poc.api.persistance.entity.Recruiter
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper(
    componentModel = "spring",
    uses = [RecruiterRequestJson::class, RecruiterResponseJson::class, Recruiter::class]
)
interface RecruiterMapper {

    companion object {
        val INSTANCE: RecruiterMapper = Mappers.getMapper(RecruiterMapper::class.java)
    }

    fun recruiterToRecruiterResponseJson(recruiter: Recruiter): RecruiterResponseJson
    fun recruiterRequestJsonToRecruiter(recruiter: RecruiterRequestJson): Recruiter

}

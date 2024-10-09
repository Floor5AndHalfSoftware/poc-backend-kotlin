package com.poc.api.service.recruiter.mapper

import com.poc.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.poc.api.controller.recruiter.dto.response.RecruiterResponseJson
import com.poc.api.persistance.recruiter.entity.Recruiter
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

    fun recruiterToRecruiterResponseJson(entity: Recruiter): RecruiterResponseJson
    fun recruiterRequestJsonToRecruiter(json: RecruiterRequestJson): Recruiter

}

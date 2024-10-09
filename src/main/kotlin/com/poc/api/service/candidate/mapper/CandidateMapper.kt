package com.poc.api.service.candidate.mapper

import com.poc.api.controller.candidate.dto.request.CandidateRequestJson
import com.poc.api.controller.candidate.dto.response.CandidateResponseJson
import com.poc.api.persistance.candidate.entity.Candidate
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper(
    componentModel = "spring",
    uses = [CandidateRequestJson::class, CandidateResponseJson::class, Candidate::class]
)
interface CandidateMapper {

    companion object {
        val INSTANCE: CandidateMapper = Mappers.getMapper(CandidateMapper::class.java)
    }

    fun recruiterToRecruiterResponseJson(entity: Candidate): CandidateResponseJson
    fun recruiterRequestJsonToRecruiter(json: CandidateRequestJson): Candidate

}

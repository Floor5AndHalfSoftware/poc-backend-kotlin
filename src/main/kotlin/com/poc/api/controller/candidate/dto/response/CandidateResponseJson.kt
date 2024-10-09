package com.poc.api.controller.candidate.dto.response

import com.fasterxml.jackson.annotation.JsonInclude
import java.sql.Timestamp

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class CandidateResponseJson (
    var id: Int = 0,
    var firstName: String = "",
    var lastName: String = "",
    var email: String = "",
    var phone: String = "",
    var address: String = "",
    var city: String = "",
    var state: String = "",
    var country: String = "",
    var postalCode: String = "",
    var university: String = "",
    var academicDegree: String = "",
    var workExperience: String = "",
    var skills: String = ""
)
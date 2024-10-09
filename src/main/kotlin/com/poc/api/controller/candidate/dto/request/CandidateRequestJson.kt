package com.poc.api.controller.candidate.dto.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Pattern


data class CandidateRequestJson(
    var id: Int = 0,
    var firstName: String = "",
    var lastName: String = "",
    @field:Email(message = "Email should be valid")
    var email: String = "",
    @field:Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message = "Mobile number is invalid")
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
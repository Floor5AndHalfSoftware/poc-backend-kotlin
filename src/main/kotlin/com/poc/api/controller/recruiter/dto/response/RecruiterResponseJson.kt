package com.poc.api.controller.recruiter.dto.response

import com.fasterxml.jackson.annotation.JsonInclude
import java.sql.Timestamp

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class RecruiterResponseJson (
    var id: Int = 0,
    var firstName: String = "",
    var lastName: String = "",
    var email: String = "",
    var phone: String = "",
    var company: String = "",
    var creationDate: Timestamp? = null
)
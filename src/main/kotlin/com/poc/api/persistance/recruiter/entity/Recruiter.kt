package com.poc.api.persistance.recruiter.entity

import java.sql.Timestamp

data class Recruiter(
        var id: Int = 0,
        var firstName: String = "",
        var lastName: String = "",
        var email: String = "",
        var phone: String = "",
        var company: String = "",
        var creationDate: Timestamp? = null
)

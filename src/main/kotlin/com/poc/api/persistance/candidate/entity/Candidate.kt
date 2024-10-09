package com.poc.api.persistance.candidate.entity

import java.sql.Timestamp

data class Candidate(
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
        var skills: String = "",
        var creationDate: Timestamp? = null
)
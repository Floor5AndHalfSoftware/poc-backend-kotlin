package com.poc.api.persistance.recruiter.entity

import java.sql.Timestamp

data class RecruiterProjectCandidate(
        var id: Int = 0,
        var recruiterId: Int = 0,
        var projectId: Int = 0,
        var candidateId: Int = 0,
        var assignmentDate: Timestamp? = null
)

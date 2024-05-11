package com.poc.api.persistance.entity

import java.sql.Date
import java.sql.Timestamp

data class Project(
        var id: Int = 0,
        var name: String = "",
        var description: String = "",
        var startDate: Date? = null,
        var endDate: Date? = null,
        var recruiterId: Int = 0,
        var creationDate: Timestamp? = null
)

package com.poc.api.persistance.candidate.repository

import com.poc.api.persistance.candidate.entity.Candidate
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface CandidateMapperRepository {
    @Insert(
        "INSERT INTO recruitment.candidates \n" +
                "(first_name, last_name, email, phone, address, city, state, country, postal_code, university, academic_degree, work_experience, skills) \n" +
                "VALUES \n" +
                "(#{firstName},#{lastName},#{email},#{phone},#{address},#{city},#{state},#{country},#{postalCode},#{university},#{academicDegree},#{workExperience},#{skills})"
    )
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    fun create(candidate: Candidate)
}
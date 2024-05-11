package com.poc.api.persistance.repository.mybatis

import com.poc.api.persistance.entity.Recruiter
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface RecruiterMapperRepository {
    @Select("SELECT * FROM recruitment.recruiters")
    fun findAll(): List<Recruiter>
}
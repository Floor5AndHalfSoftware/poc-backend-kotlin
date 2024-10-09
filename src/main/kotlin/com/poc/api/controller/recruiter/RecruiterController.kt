package com.poc.api.controller.recruiter

import com.poc.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.poc.api.controller.recruiter.dto.response.RecruiterResponseJson
import com.poc.api.service.recruiter.RecruiterService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(value = ["/api/v1"])
class RecruiterController {

    @Autowired
    private lateinit var recruiterService: RecruiterService

    @GetMapping("/recruiters")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun retrieveAll(): ResponseEntity<List<RecruiterResponseJson>> {
        val dtoList: List<RecruiterResponseJson> = recruiterService.findAll()
        return ResponseEntity.ok().body(dtoList)
    }

    @PostMapping("/recruiters")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody recruiter: RecruiterRequestJson): ResponseEntity<RecruiterResponseJson> {
        val dto: RecruiterResponseJson = recruiterService.create(recruiter)
        return ResponseEntity.ok().body(dto)
    }
}
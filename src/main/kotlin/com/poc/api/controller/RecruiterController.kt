package com.poc.api.controller

import com.poc.api.controller.dto.response.RecruiterResponseJson
import com.poc.api.service.recruitment.RecruiterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController("uploadFileController")
//@CrossOrigin(origins = ["*"], allowedHeaders = ["*"], maxAge = 3600) //TODO Probar
@RequestMapping(value = ["/api/v1"])
class RecruiterController {

    @Autowired
    private lateinit var recruiterService: RecruiterService

    @GetMapping("/recruitments")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun retrieveAll(): ResponseEntity<List<RecruiterResponseJson>> {
        val dtoList: List<RecruiterResponseJson> = recruiterService.findAll()
        return ResponseEntity.ok().body(dtoList)
    }
}
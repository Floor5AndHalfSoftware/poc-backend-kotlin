package com.poc.api

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(
        "com.poc.api.persistance.repository.mybatis"
)
class MainApplication

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}

package com.dsmanioto.searchopportunity.searchopportunityapi.controller

import com.dsmanioto.searchopportunity.searchopportunityapi.model.Company
import com.dsmanioto.searchopportunity.searchopportunityapi.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("companys")
class CompanyController {

    @Autowired
    lateinit var service: CompanyService

    @GetMapping
    fun findAll(): List<Company> {
        return service.findAll()
    }

    @GetMapping("/{id}")
    fun findbyId(@PathVariable("id") id: Int): Company {
        return service.findAll().stream().findAny().get();
    }

}
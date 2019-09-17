package com.dsmanioto.searchopportunity.searchopportunityapi.controller

import com.dsmanioto.searchopportunity.searchopportunityapi.model.Company
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("companys")
class CompanyController {

    @GetMapping
    fun list(): List<Company> {
        return listOf(Company("Sony", "Enterprise"),
                Company("IBM", "Enterprise"))
    }

}
package com.dsmanioto.searchopportunity.searchopportunityapi.service

import com.dsmanioto.searchopportunity.searchopportunityapi.model.Company
import org.springframework.stereotype.Service

@Service
class CompanyService {

    fun findAll() : List<Company> {
        return listOf(Company("Sony", "Enterprise"),
                Company("IBM", "Enterprise"))
    }

}
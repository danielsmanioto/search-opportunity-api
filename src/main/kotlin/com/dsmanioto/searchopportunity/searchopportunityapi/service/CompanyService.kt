package com.dsmanioto.searchopportunity.searchopportunityapi.service

import com.dsmanioto.searchopportunity.searchopportunityapi.model.Company
import com.dsmanioto.searchopportunity.searchopportunityapi.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService {

    @Autowired
    lateinit var repository: CompanyRepository

    fun findAll(): List<Company> {
        return repository.findAll()
    }

    fun findById(id: Int): Company {
        return repository.findById(id)
    }

    fun findByName(name: String): Company {
        return repository.findByName(name)
    }

}
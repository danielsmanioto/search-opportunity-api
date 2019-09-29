package com.dsmanioto.searchopportunity.searchopportunityapi.repository

import com.dsmanioto.searchopportunity.searchopportunityapi.model.Company
import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.util.*

@Repository
class CompanyRepository {

    fun findAll(): List<Company> = findAllCompanys()

    fun findById(id: Int): Company {
        val company : Optional<Company> = findAllCompanys().stream().filter { e -> e.id.equals(id)}.findFirst()
        if(!company.isPresent)
            throw Throwable("Not found");

        return company.get()
    }

    fun findByName(name: String): Company {
        return findAllCompanys().stream().filter { e -> e.name == name }.findAny().get()
    }

    fun findAllCompanys() = listOf(Company(1, "Sony", "Enterprise", LocalDate.now()),
            Company(2, "IBM", "Enterprise", LocalDate.now()))

}
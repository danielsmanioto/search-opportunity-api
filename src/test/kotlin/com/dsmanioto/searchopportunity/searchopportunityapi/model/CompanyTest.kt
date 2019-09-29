package com.dsmanioto.searchopportunity.searchopportunityapi.model

import org.junit.Test
import java.time.LocalDate

class CompanyTest {

    @Test
    fun validateFields() {
        val companySmanioto = Company(1, "Smanioto LTDA", "My Company", LocalDate.now())
        val companyCalixto = Company(2, "Calixto SA", "Carol' Company", LocalDate.now())

        print("Carol name: ${companyCalixto.name} and Smanioto name : ${companySmanioto.name}")
    }

}

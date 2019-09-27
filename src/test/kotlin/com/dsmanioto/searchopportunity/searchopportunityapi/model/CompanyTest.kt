package com.dsmanioto.searchopportunity.searchopportunityapi.model

import org.junit.Test

class CompanyTest {

    @Test
    fun validateFields() {
        val companySmanioto = Company("Smanioto LTDA", "My Company")
        val companyCalixto = Company("Calixto SA", "Carol' Company")

        print("Carol name: ${companyCalixto.title} and Smanioto name : ${companySmanioto.title}")
    }

}

package com.dsmanioto.searchopportunity.searchopportunityapi.model

import org.junit.Test

class OpportunityTest {

    @Test
    fun validateFields() {
        val softwareProgramer = Opportunity(1, "Looking for good developpers")
        print("About Job ${softwareProgramer.description}")
    }

}
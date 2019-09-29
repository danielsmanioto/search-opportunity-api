package com.dsmanioto.searchopportunity.searchopportunityapi.model

import java.time.LocalDate

data class Company(val id: Long,
                   val name: String,
                   val description: String,
                   val dateRegister: LocalDate)

package com.riobener.departmentservice.entity


import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Department(
    @Id
    val id: UUID?,
    val departmentName: String,
    val departmentAddress: String,
    val departmentCode: String
)
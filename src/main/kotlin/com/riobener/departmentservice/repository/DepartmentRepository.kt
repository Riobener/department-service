package com.riobener.departmentservice.repository

import com.riobener.departmentservice.entity.Department
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface DepartmentRepository : JpaRepository<Department?, UUID?> {
    fun findById(id: UUID?): Department?
}
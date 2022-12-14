package com.riobener.departmentservice.service

import com.riobener.departmentservice.entity.Department
import com.riobener.departmentservice.repository.DepartmentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class DepartmentService(
    private val departmentRepository: DepartmentRepository
) {
    fun saveDepartment(department: Department): Department {
        return departmentRepository.save(department)
    }

    fun findDepartmentById(departmentId: UUID?): Department? {
        return departmentRepository.findById(departmentId)
    }
}
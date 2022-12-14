package com.riobener.departmentservice.controller

import com.riobener.departmentservice.entity.Department
import com.riobener.departmentservice.service.DepartmentService
import io.opentracing.Span
import io.opentracing.SpanContext
import io.jaegertracing.internal.JaegerSpanContext
import io.opentracing.Tracer
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/departments")
class DepartmentController(
    private val departmentService: DepartmentService,
) {

    @GetMapping("/health")
    fun checkHealth() = "All good"

    @PostMapping("/")
    fun saveDepartment(@RequestParam name: String, address: String, code: String): Department {
        return departmentService.saveDepartment(
            Department(
                id = UUID.randomUUID(),
                departmentName = name,
                departmentAddress = address,
                departmentCode = code
            )
        )
    }

    @GetMapping("/{id}")
    fun findDepartmentById(@PathVariable("id") departmentId: String): Department? {
        return departmentService.findDepartmentById(UUID.fromString(departmentId))
    }
}
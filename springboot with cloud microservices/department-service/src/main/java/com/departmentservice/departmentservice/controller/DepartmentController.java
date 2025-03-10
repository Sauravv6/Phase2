package com.departmentservice.departmentservice.controller;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.departmentservice.departmentservice.entity.Department;
import com.departmentservice.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}
	@PutMapping("/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
	    log.info("Inside updateDepartment of DepartmentController");
	    return departmentService.updateDepartment(departmentId, department);
	}

	@DeleteMapping("/{id}")
	public Map<String, String> deleteDepartment(@PathVariable("id") Long departmentId) {
	    log.info("Inside deleteDepartment of DepartmentController");
	    departmentService.deleteDepartment(departmentId);
	    return Collections.singletonMap("message", "Department deleted successfully!");
	}

}

package com.departmentservice.departmentservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentservice.departmentservice.entity.Department;
import com.departmentservice.departmentservice.repository.DepartmentRepository;

import jakarta.transaction.Transactional;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside saveDepartment of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	public Department updateDepartment(Long departmentId, Department department) {
	    log.info("Inside updateDepartment of DepartmentService");
	    Department existingDepartment = departmentRepository.findByDepartmentId(departmentId);
	    if (existingDepartment != null) {
	        existingDepartment.setDepartmentName(department.getDepartmentName());
	        existingDepartment.setDepartmentAddress(department.getDepartmentAddress());
	        existingDepartment.setDepartmentCode(department.getDepartmentCode());
	        return departmentRepository.save(existingDepartment);
	    }
	    return null;
	}

	public void deleteDepartment(Long departmentId) {
	    log.info("Inside deleteDepartment of DepartmentService");
	    departmentRepository.deleteById(departmentId);
	}

	
}

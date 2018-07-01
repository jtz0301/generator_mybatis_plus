package com.jz.controller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import com.jz.entity.Employee;
import com.jz.service.EmployeeService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jz
 * @since 2018-07-01
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("queryAll")
	public void queryAll() {
		List<Employee> list = employeeService.selectList(new EntityWrapper<Employee>());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}
	
	
	
}


package com.jz.service.impl;

import com.jz.entity.Employee;
import com.jz.mapper.EmployeeMapper;
import com.jz.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jz
 * @since 2018-07-01
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}

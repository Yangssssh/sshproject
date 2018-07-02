package cn.itcast.service;

import cn.itcast.dao.EmployeeDao;
import cn.itcast.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    public Employee findById(Serializable id){
        return employeeDao.findbId(id);
    }
}

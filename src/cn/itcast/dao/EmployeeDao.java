package cn.itcast.dao;

import cn.itcast.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class EmployeeDao {
    @Autowired
    private SessionFactory SessionFactory;
   public Employee findbId(Serializable id){
      return (Employee) SessionFactory.getCurrentSession().get(Employee.class,id);
    }
}

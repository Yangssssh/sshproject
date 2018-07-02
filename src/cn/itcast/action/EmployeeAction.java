package cn.itcast.action;

import cn.itcast.entity.Employee;
import cn.itcast.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class EmployeeAction extends ActionSupport {
    @Autowired
    private EmployeeService employeeService;
    @Override
    public String execute() throws Exception {
        int empid=4;
        Employee emp=employeeService.findById(empid);
        Map<String,Object> request= (Map<String, Object>) ActionContext.getContext().get("request");
        request.put("emp",emp);
        return SUCCESS;
    }
}

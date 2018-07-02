package cn.itcast.entity;

import java.util.HashSet;
import java.util.Set;

public class Dept {
private int deptid;
private String deptname;
private Set<Employee> emps=new HashSet<Employee>();
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public Set<Employee> getEmps() {
	return emps;
}
public void setEmps(Set<Employee> emps) {
	this.emps = emps;
}

}

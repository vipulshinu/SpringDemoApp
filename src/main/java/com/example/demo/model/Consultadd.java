package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consultadd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long   empId;
    private String name;
    private String dept;
    private  Integer salary;
    private String pf;

    public Consultadd()
    {
    }
    public Consultadd(Long id,String name,String dept,Integer salary,String pf)
    {
        this.empId = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.pf = pf;
    }


    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public  Integer getSalary() {
        return salary;
    }

    public void setSalary( Integer salary) {
        this.salary = salary;
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf;
    }
}

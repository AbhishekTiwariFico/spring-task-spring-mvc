package com.luv2code.springdemo.entity;

public class Employee
{
     Integer id;
     String name;
     String department;

     public Employee()
     {
     }
     public Employee(Integer id,String name,String department)
     {
         this.id = id;
         this.name=name;
         this.department=department;
     }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

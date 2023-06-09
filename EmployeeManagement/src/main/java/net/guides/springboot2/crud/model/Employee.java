package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    private long id;
    private String name;
    private String title;
    private String department;

    public Employee() {
  
    }
 
    public Employee(String name, String title, String department){
        this.name = name;
        this.title = title;
        this.department = department;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name = "last_name", nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Column(name = "department", nullable = false)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EMP [id=" + id + ", name=" + name + ", title=" + title + ", department=" + department
       + "]";
    }
 
}
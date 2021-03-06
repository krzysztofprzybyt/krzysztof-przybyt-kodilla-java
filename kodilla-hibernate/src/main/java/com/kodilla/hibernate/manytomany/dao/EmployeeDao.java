package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveEmployeesForName(@Param("LASTNAME") String lastname);
    @Query
    List<Employee> retrieveEmployeesForNameLikes(@Param("LETTERS") String letters);

    @Override
    Employee save(Employee employee);
    @Override
    void deleteAll();
}

package com.henfanren.dao;

import com.henfanren.bean.Student;
import com.henfanren.bean.StudentMarks;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
    void create(String name, Integer age, Integer marks, Integer year);
    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    Student getStudent(Integer id);
    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    List<StudentMarks> listStudents();
    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     */
    void delete(Integer id);
    /**
     * This is the method to be used to update
     * a record into the Student table.
     */
    void update(Integer id, Integer age);
}

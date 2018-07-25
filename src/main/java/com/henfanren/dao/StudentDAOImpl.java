package com.henfanren.dao;

import com.henfanren.bean.Student;
import com.henfanren.mapper.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @ProjectName: SpringProject
 * @ClassName: StudentDAOImpl
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/25 8:59
 * @Modified By:
 */
public class StudentDAOImpl implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "INSERT INTO student (name, age) VALUES(?, ?)";
        int update = jdbcTemplateObject.update(sql, name, age);
        System.out.println(update + " insert success");
    }

    @Override
    public Student getStudent(Integer id) {
        String sql = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from Student where id = ?";
        jdbcTemplateObject.update(sql, id);
        System.out.println("Deleted Record with ID = " + id );
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(sql, age, id);
        System.out.println("Updated Record with ID = " + id );
    }
}

package com.henfanren.mapper;

import com.henfanren.bean.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ProjectName: SpringProject
 * @ClassName: StudentMapper
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/25 9:42
 * @Modified By:
 */
public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}

package com.henfanren.mapper;

import com.henfanren.bean.StudentMarks;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ProjectName: SpringProject
 * @ClassName: StudentMarksMapper
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/25 11:48
 * @Modified By:
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {

    @Override
    public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setId(rs.getInt("id"));
        studentMarks.setName(rs.getString("name"));
        studentMarks.setAge(rs.getInt("age"));
        studentMarks.setSid(rs.getInt("sid"));
        studentMarks.setMarks(rs.getInt("marks"));
        studentMarks.setYear(rs.getInt("year"));
        return studentMarks;
    }
}

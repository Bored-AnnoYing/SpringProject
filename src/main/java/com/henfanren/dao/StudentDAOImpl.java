package com.henfanren.dao;

import com.henfanren.bean.Student;
import com.henfanren.bean.StudentMarks;
import com.henfanren.mapper.StudentMapper;
import com.henfanren.mapper.StudentMarksMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

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
    private PlatformTransactionManager transactionManager;

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        TransactionDefinition definition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(definition);
        try {
            String sql1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplateObject.update( sql1, name, age);

            // Get the latest student id to be used in Marks table
            String sql2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForInt( sql2 );

            String sql3 = "insert into Marks(sid, marks, year) " +
                    "values (?, ?, ?)";
            jdbcTemplateObject.update( sql3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);
            transactionManager.commit(status);
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            transactionManager.rollback(status);
            throw e;
        }
    }

    @Override
    public Student getStudent(Integer id) {
        String sql = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<StudentMarks> listStudents() {
        String sql = "select * from Student, Marks where Student.id=Marks.sid";
        List <StudentMarks> studentMarks = jdbcTemplateObject.query(sql,
                new StudentMarksMapper());
        return studentMarks;
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

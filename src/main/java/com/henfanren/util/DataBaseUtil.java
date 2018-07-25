package com.henfanren.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

/**
 * @ProjectName: SpringProject
 * @ClassName: DataBaseUtil
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/24 17:51
 * @Modified By:
 */
@Component
public class DataBaseUtil {

    @Autowired
    public DataSource dataSource;

    private static Connection connection;

    public Connection getConnection(){
        if (Objects.nonNull(connection)) {
            return connection;
        }
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}

package com.lin.service;

import com.lin.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/24 16:56
 * @Description:
 */
public class SimpleExcutor implements Excutor {
    @Override
    public <T> T query(String sql, Object parameter) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        connection = getConnection();
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            ResultSet set = pre.executeQuery();
            User u = new User();
            while (set.next()) {
                u.setName(set.getString(0));
            }
            return (T)u;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public Connection getConnection() {

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521/orclpdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

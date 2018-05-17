package dao;

import db.DbUtil;
import model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDao {
    //获取连接
    public void addPerson(Person p) throws SQLException
    {
        System.out.println("PersonDao开始");
        //获取连接
        Connection conn = DbUtil.getConnection();
        String sql = "INSERT INTO person(user_name) VALUES(?)";

        //预编译
        PreparedStatement ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行

        //传参
        ptmt.setString(1,p.getUserName());

        //执行
        ptmt.execute();
    }
}

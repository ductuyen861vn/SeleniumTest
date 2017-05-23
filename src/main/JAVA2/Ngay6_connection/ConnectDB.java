/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay6_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class ConnectDB {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/nhapxuathoaqua?useUnicode=true&characterEncoding=utf8";
    private static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    private static final String JDBC_ADMIN_USERNAME="root";
    private static final String JDBC_ADMIN_PASSWORD="";
    
    
    private Connection connect () throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_ADMIN_USERNAME, JDBC_ADMIN_PASSWORD);
        return conn;
    }
    
    
    public boolean testAccount(String username, String password) throws ClassNotFoundException, SQLException{
        try(Connection conn = this.connect()){
        String query = "select * from user Where username = '"+username+"' and password = '"+password+"'";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet.next();
        
        }
    }
    
    
    public void addUser(User user) throws ClassNotFoundException, SQLException{
        try (Connection conn = this.connect()){
//        String edit = "INSERT INTO user VALUES(null, ?, ?)";
//        PreparedStatement ps = conn.prepareStatement(edit);
//        ps.setString(1, user.getUsername());
//        ps.setString(2, user.getPassword());
//        ps.executeUpdate();
            
          String edit = "INSERT INTO user VALUES(null,'"+user.getUsername()+"','"+user.getPassword()+"')";
          Statement s = conn.createStatement();
          s.executeUpdate(edit);
        }
    
    }
    
    public void Product(Product product) throws ClassNotFoundException, SQLException{
        try (Connection conn = this.connect()){
        String edit = "INSERT INTO product VALUES(null, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(edit);
        ps.setString(1, product.getProduct());
        ps.setDouble(2, product.getPrice());
        ps.setInt(3, product.getAmount());
        ps.execute();    
            
        }}
    
    
    public List<Product> listSearchProduct (String name) throws ClassNotFoundException, SQLException{
        List<Product> list = new ArrayList<>();
    try (Connection conn = this.connect()){
        String search = "SELECT * FROM product Where name like '%"+name+"%'";
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery(search);
        while(rs.next()){
        list.add(new Product(rs.getString("name"), rs.getDouble("price"), rs.getInt("amount")));
        }
    }
    return list;
    }
    
    
    public void delete (String name) throws ClassNotFoundException, SQLException{
        try (Connection conn = this.connect()){
        String delete = "DELETE FROM product Where name = '"+name+"'";
        Statement s = conn.createStatement();
        s.execute(delete);
//          String delete = "DELETE FROM product Where name = ?";
//          PreparedStatement ps = conn.prepareStatement(delete);
//          ps.setString(1, name);
//          ps.execute();
    }
    }
    
    public void update (String name, Product p) throws ClassNotFoundException, SQLException{
        try (Connection conn = this.connect()){
        String update = "UPDATE product SET name=?,price=?,amount=? WHERE name=?";
        PreparedStatement ps = conn.prepareStatement(update);
        ps.setString(1, p.getProduct());
        ps.setDouble(2, p.getPrice());
        ps.setInt(3, p.getAmount());
        ps.setString(4, name);
        ps.execute();
    }
    }
    
    
    public double SearchMaxPrice () throws ClassNotFoundException, SQLException {
    try (Connection conn = this.connect()){
        String searchMax = "select max(price) as maxprice from product";
        PreparedStatement ps = conn.prepareStatement(searchMax);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            return rs.getDouble("maxprice");
        else
            return 0;
        }
    }
    
}


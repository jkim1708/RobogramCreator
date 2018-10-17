package com.MoveParametres;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.sql.*;
import java.util.ArrayList;

public class Wobjdata {
    // == variables
    private static final String value = ":=[[FALSE,TRUE,__,[[0,0,0],[1,0,0,0]],[[0,0,0],[1, 0, 0 ,0]]]";
    private static final String datatype = "wobjdata";
    private static int numberStation = 1;
    private String name;

    // == constructors ==
    public Wobjdata() {

    }

    // == methods ==
public String getDbData() {
    // Create a ResultSetHandler implementation to convert the
// first row into an Object[].
    ResultSetHandler<Object[]> h = new ResultSetHandler<Object[]>() {
        public String[] handle(ResultSet rs) throws SQLException {
            if (!rs.next()) {
                return null;
            }

            ResultSetMetaData meta = rs.getMetaData();
            int cols = meta.getColumnCount();
            String[] result = new String[cols];

            for (int i = 0; i < cols; i++) {
                result[i] = (String) rs.getObject(i + 1);
            }

            return result;
        }
    };

    QueryRunner run = new QueryRunner();

    try (Connection conn = connectDatabase("stationDB.db");){
        Object[] result = run.query(
                conn, "SELECT * FROM Person WHERE name=?", h, "John Doe");
        // do something with the result
        return result[0].toString();
    } catch (SQLException e){
        e.getMessage();
        System.out.println("something went wrong");
    }
return null;

}

//    private void addStation(String name) {
//        Connection conn = connectDatabase("stationDB.db");
//        String sql = "INSERT INTO stations (id,name) " +
//                "VALUES (" + numberStation + "," + "'" + name + "'" + ");";
//        try {
//            if (conn != null) {
//                // add new station in database
//                DatabaseMetaData meta = conn.getMetaData();
//                Statement stmt = conn.createStatement();
//                stmt.execute(sql);
//                numberStation++;
//            }
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//    public void deleteStation(int id) {
//        Connection conn = connectDatabase("stationDB.db");
//        String sql = "DELETE FROM stations WHERE id = +" + id + ";";
//        try {
//            if (conn != null) {
//                // add new station in database
//                DatabaseMetaData meta = conn.getMetaData();
//                Statement stmt = conn.createStatement();
//                stmt.execute(sql);
//                numberStation++;
//            }
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//
    private Connection connectDatabase(String filename) {


//            String url ="jdbc:sqlite:"+System.getProperty("user.dir")+filename;
        String url = "jdbc:sqlite:" + filename;

        System.out.println(System.getProperty("user.dir"));
        String sql = "CREATE TABLE IF NOT EXISTS stations (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name String NOT NULL\n"
                + ");";
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                System.out.println("Database connected");
                // create new table
                DatabaseMetaData meta = conn.getMetaData();
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
            }
            return conn;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
//
//    public void printStations() {
//
//        try {
//            Connection conn = connectDatabase("stationDB.db");
//            String sql = "SELECT * FROM stations";
//            if (conn != null) {
//                Statement stmt = conn.createStatement();
//                ResultSet result = stmt.executeQuery(sql);
//                while (result.next()) {
//                    String s = result.getString("name");
//                    System.out.println(s);
//                }
//                result.close();
//            }
////            conn.close();
//        } catch (SQLException e) {
//            System.out.println("print error");
//            System.out.println(e.getMessage());
//            System.out.println("print error");
//        }
//
//
//    }
//
//    public String getName() {
//        return this.name;
//    }
}


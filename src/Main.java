import com.CONSTANTS_AND_HEADERS.CONSTANTS;
import com.CreateJobs.Job;
import com.MoveInstructions.MoveJoint;
import com.MoveInstructions.MoveLinear;
import com.MoveParametres.*;
import com.TestChild;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.sql.*;


import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Main {


    public static void main(String[] args) {

        Wobjdata w1 = new Wobjdata();

        System.out.println(w1.getDbDataTest());
//        initialize();
//
//
//
//
////        Robtarget firstRobT = new Robtarget("Home", SCOPE.VAR);
//
//        Wobjdata  firstWorkW = new Wobjdata("Home", SCOPE.VAR);
//        Wobjdata secondWorkW = new Wobjdata("wRightStation", SCOPE.VAR);
//        Tooldata tTool = new Tooldata("tTool");
//
//        Job Job_10 = new Job(10);
//        Job Job_20 = new Job(20);
//
//        System.out.println(Job_10.createJob(Job.JobMode.PICK,firstWorkW,tTool));
//        System.out.println(Job_20.createJob(Job.JobMode.PLACE,firstWorkW,tTool));
//
////        secondWorkW.printStations();
////        StringBuilder strBuilder = new StringBuilder();
//
//
//        terminate();

    }



    public static void initialize(){
//        connectDatabase();
    }

    public static void terminate(){

    }



//    public static void connectDatabase() {
//        String url ="jdbc:sqlite:"+System.getProperty("user.dir")+"test.db";
//
//        String sql = "CREATE TABLE IF NOT EXISTS stations (\n"
//                + "	id integer PRIMARY KEY,\n"
//                + "	name text NOT NULL\n"
//                + ");";
//
//        try {
//            Connection conn = DriverManager.getConnection(url);
//            if (conn != null) {
//                DatabaseMetaData meta = conn.getMetaData();
//                System.out.println("Database connected");
//                Statement stmt = conn.createStatement();
//                    // create a new table
//                    stmt.execute(sql);
//                }
//            conn.close();
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }



}

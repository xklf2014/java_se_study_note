package com.jdbc.dao.impl;

import com.jdbc.dao.BatchDao;
import com.jdbc.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDaoImpl implements BatchDao {
    @Override
    public void batchInsert() {
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "insert into emp(empno,ename) values(?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i =0;i<10;i++){
                pstmt.setInt(1,1000+i);
                pstmt.setString(2,"batchName"+i);
                pstmt.addBatch();
            }
            int[] ints = pstmt.executeBatch();
            for (int i : ints){
                System.out.println(i);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(conn,pstmt);
        }


    }
}

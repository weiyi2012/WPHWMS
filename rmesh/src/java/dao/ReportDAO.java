/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Report;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author weiyi.ngow.2012
 */
public class ReportDAO {

    public static Report retrieve(String name) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Report report = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from REPORT where reportName = ?");
            stmt.setString(1, name);

            rs = stmt.executeQuery();
            while (rs.next()) {
                //report = new Report(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                report = new Report(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return report;
    }

    public static List<Report> retrieveAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Report> reportList = new ArrayList<Report>();

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM report");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Report report = new Report(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6));
                reportList.add(report);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return reportList;
    }

    public static void delete(String scenarioID) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String query = "DELETE FROM report WHERE scenarioID =?";

        try {
            conn = ConnectionManager.getConnection();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, scenarioID);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, preparedStatement, null);
        }
    }
}

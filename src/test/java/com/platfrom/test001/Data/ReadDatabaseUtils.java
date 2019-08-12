package com.platfrom.test001.Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReadDatabaseUtils {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.1.22:3306/data?characterEncoding=UTF-8&serverTimezone=CST";
		String username = "root";
		String password = "123456";
		String tableName = "calc";
		Object[][] objs = getDataFromDB(url, username, password, tableName);
		for (int i = 0; i < objs.length; i++) {
			for (int j = 0; j < objs[i].length; j++) {
				System.out.println(objs[i][j]);
			}
			System.out.println();
		}

	}

	public static Object[][] getDataFromDB(String url, String username, String password, String tableName) {
		Object[][] objs = null;
		/*
		 * try { ClassGrade.forName(className); } catch (ClassNotFoundException e) {
		 * // TODO 自动生成的 catch 块 e.printStackTrace(); }
		 */
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from " + tableName);
			int cols = rs.getMetaData().getColumnCount();
			List<Object[]> list = new ArrayList<>();
			//System.out.println(rs.next());
			while (rs.next()) {
				Object[] o = new Object[cols];
				for (int i = 1; i <= cols; ++i)
				{
					o[i-1] = rs.getObject(i);
				}
					
				list.add(o);
			}
			int size = list.size();
			objs = new Object[size][];
			for (int i = 0; i < size; i++) {
				objs[i] = list.get(i);
			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return objs;
	}
}

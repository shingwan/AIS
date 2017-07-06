package com.test.ex.Adao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.test.ex.Adto.ADto;

public class ADao {

	DataSource dataSource;

	public ADao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ADto> list() {
		ArrayList<ADto> dtos = new ArrayList<ADto>();
		Connection dbconn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			dbconn = dataSource.getConnection();
			String sql = "select * from ais order by aId asc";
			pstmt = dbconn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int aId = rs.getInt("aId");
				String aName = rs.getString("aName");
				String aStetas = rs.getString("aStetas");
				String aContentM = rs.getString("aContentM");
				String aContentG = rs.getString("aContentG");
				String aSpace = rs.getString("aSpace");
				String aDay = rs.getString("aDay");
				int aNumber = rs.getInt("aNumber");
				String aSkill = rs.getString("aSkill");
				String aYoken = rs.getString("aYoken");
				String aSangryu = rs.getString("aSangryu");
				String aEtc = rs.getString("aEtc");
				String aManager = rs.getString("aManager");
				Date aDate = rs.getDate("aDate");

				ADto dto = new ADto(aId, aName, aStetas, aContentM, aContentG, aSpace, aDay, aNumber, aSkill, aYoken,
						aSangryu, aEtc, aManager, aDate);
				dtos.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (dbconn != null)
					dbconn.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
		return dtos;
	}

	public void write(String aName, String aStetas, String aContentM, String aContentG, String aSpace, String aDay,
			int aNumber, String aSkill, String aYoken, String aSangryu, String aEtc, String aManager) {
		Connection dbconn = null;
		PreparedStatement pstmt = null;

		try {
			dbconn = dataSource.getConnection();
			String sql = "insert into ais(aId, aName, aStetas, aContentM, aContentG, aSpace, aDay, aNumber, aSkill, aYoken, aSangryu, aEtc, aManager)"
					+ "values(ais_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = dbconn.prepareStatement(sql);
			pstmt.setString(1, aName);
			pstmt.setString(2, aStetas);
			pstmt.setString(3, aContentM);
			pstmt.setString(4, aContentG);
			pstmt.setString(5, aSpace);
			pstmt.setString(6, aDay);
			pstmt.setInt(7, aNumber);
			pstmt.setString(8, aSkill);
			pstmt.setString(9, aYoken);
			pstmt.setString(10, aSangryu);
			pstmt.setString(11, aEtc);
			pstmt.setString(12, aManager);

			int n = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (dbconn != null)
					dbconn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// write

	public ADto view(String saId) {
		ADto dto = null;
		Connection dbconn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			dbconn = dataSource.getConnection();

			String sql = "select * from ais where aId=?";
			pstmt = dbconn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(saId));
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int aId = rs.getInt("aId");
				String aName = rs.getString("aName");
				String aStetas = rs.getString("aStetas");
				String aContentM = rs.getString("aContentM");
				String aContentG = rs.getString("aContentG");
				String aSpace = rs.getString("aSpace");
				String aDay = rs.getString("aDay");
				int aNumber = rs.getInt("aNumber");
				String aSkill = rs.getString("aSkill");
				String aYoken = rs.getString("aYoken");
				String aSangryu = rs.getString("aSangryu");
				String aEtc = rs.getString("aEtc");
				String aManager = rs.getString("aManager");
				Date aDate = rs.getDate("aDate");

				dto = new ADto(aId, aName, aStetas, aContentM, aContentG, aSpace, aDay, aNumber, aSkill, aYoken,
						aSangryu, aEtc, aManager, aDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (dbconn != null)
					dbconn.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
		return dto;
	}// view

	public void modify(int aId, String aName, String aStetas, String aContentM, String aContentG, String aSpace,
			String aDay, int aNumber, String aSkill, String aYoken, String aSangryu, String aEtc, String aManager) {
		Connection dbconn = null;
		PreparedStatement pstmt = null;
		try {
			dbconn = dataSource.getConnection();
			String sql = "update ais set aName =?, aStetas =?, aContentM =?, aContentG=?, aSpace=?, aDay=?, aNumber=?, aSkill =?, aYoken=?, aSangryu=?, aEtc=?, aManager=? where aId =?";
			pstmt = dbconn.prepareStatement(sql);
			pstmt.setString(1, aName);
			pstmt.setString(2, aStetas);
			pstmt.setString(3, aContentM);
			pstmt.setString(4, aContentG);
			pstmt.setString(5, aSpace);
			pstmt.setString(6, aDay);
			pstmt.setInt(7, aNumber);
			pstmt.setString(8, aSkill);
			pstmt.setString(9, aYoken);
			pstmt.setString(10, aSangryu);
			pstmt.setString(11, aEtc);
			pstmt.setString(12, aManager);
			pstmt.setInt(13, aId);
			int n = pstmt.executeUpdate();
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (dbconn != null)
					dbconn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void delete(int aId) {
		Connection dbconn = null;
		PreparedStatement pstmt = null;

		try {
			dbconn = dataSource.getConnection();
			String sql = "delete from ais where aId =?";
			pstmt = dbconn.prepareStatement(sql);
			pstmt.setInt(1, aId);

			int n = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (dbconn != null)
					dbconn.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
	}public ArrayList<ADto> getBoardList(HashMap<String, Object> listOpt){
		ArrayList<ADto> list = new ArrayList<ADto>();

		String opt = (String)listOpt.get("opt");
		String condition = (String) listOpt.get("condition");
		int start = (Integer)listOpt.get("start");

		Connection dbconn = null;
		PreparedStatement pstmt = null;

		try {
			dbconn = dataSource.getConnection();
			StringBuffer sql = new StringBuffer();

			if(opt == null){
				sql.append("select*from ");
				sql.append("(select rownum rnum, aId, aName, aStetas, aContentM, aContentG, aSpace, aDay, aNumber, aSkill, aYoken, aSangryu, aEtc, aManager");
				sql.append("from");
				sql.append("(select * from ais order by aId desc))");
				sql.append("where rnum >=? and rnum<=?");

				pstmt = dbconn.prepareStatement(sql.toString());
				pstmt.setInt(1, start);
				pstmt.setInt(2, start+9);

				// StringBuffer를 비운다.
				sql.delete(0, sql.toString().length());
			}
			else if(opt.equals("1")) // 내용으로 검색
			{
				sql.append("select * from ");
				sql.append("select*from ");
				sql.append("(select rownum rnum, aId, aName, aStetas, aContentM, aContentG, aSpace, aDay, aNumber, aSkill, aYoken, aSangryu, aEtc, aManager");
				sql.append("from");
				sql.append("(select * from ais where aName like ? ");
				sql.append(" order by aId desc)) ");
				sql.append("where rnum>=? and rnum<=?");

				pstmt = dbconn.prepareStatement(sql.toString());
				pstmt.setString(1, "%"+condition+"%");
				pstmt.setInt(2, start);
				pstmt.setInt(3, start+9);

				sql.delete(0, sql.toString().length());
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return list;

	}

	public static ADao getInstance() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public int getBoardListCount(HashMap<String, Object> listOpt) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}